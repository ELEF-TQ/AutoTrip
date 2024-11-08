package com.ParcAuto.Ensa.Affectation.Controllers;


import com.ParcAuto.Ensa.Affectation.Entities.User.User;
import com.ParcAuto.Ensa.Affectation.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    private final UserService userService ;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }


    @PostMapping("/register")
    public User register(@RequestBody User user){
        return userService.register(user) ;
    }


}
