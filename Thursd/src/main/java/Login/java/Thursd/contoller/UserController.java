package Login.java.Thursd.contoller;

import Login.java.Thursd.dto.UserDto;
import Login.java.Thursd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
@Autowired
private UserService userService;
    @GetMapping("/registration")
    public String getRegistrationPage (@ModelAttribute("User")UserDto userDto){
        return "register";
    }
    @PostMapping("/registration")   //Used to save user
    public String saveUser(@ModelAttribute("User")UserDto userDto, Model model){
       userService.save(userDto);
       model.addAttribute("message","Registered Succesfully");
        return "register";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }

}
