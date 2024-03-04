package Login.java.Thursd.service;

import Login.java.Thursd.dto.UserDto;
import Login.java.Thursd.model.User;
import Login.java.Thursd.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service

public class UserServiceImpl implements UserService{
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;
    @Override
    public User save(UserDto userDto) {
        User user= new User(userDto.getEmail(),passwordEncoder.encode(userDto.getPassword()), userDto.getRole(), userDto.getFullname() );
        return userRepository.save(user);
    }
}
