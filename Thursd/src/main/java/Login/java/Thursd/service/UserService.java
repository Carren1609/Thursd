package Login.java.Thursd.service;

import Login.java.Thursd.dto.UserDto;
import Login.java.Thursd.model.User;

public interface UserService {
    User save(UserDto userDto);     //Save it using Dto(Data Transfer Object)

}
