package controller;

import model.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;

@RestController
public class UserController {

   @Autowired
   private UserService userService;

    @PostMapping("v1/enroll")
    public void enroll(UserDetails userDetails){
        userService.saveUserDetails(userDetails);
    }

}
