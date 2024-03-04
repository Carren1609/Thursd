package Login.java.Thursd.service;

import Login.java.Thursd.model.User;
import Login.java.Thursd.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    User user= userRepository.findByEmail(username);
            if(user== null){
            throw new UsernameNotFoundException("user not found");
        }
        return new CustomUserDetails(user);
    }
}
