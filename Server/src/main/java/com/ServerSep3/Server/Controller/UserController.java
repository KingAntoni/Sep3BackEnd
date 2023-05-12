package com.ServerSep3.Server.Controller;

import com.ServerSep3.Server.Model.UserModel;
import com.ServerSep3.Server.Service.UserService;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserModel> findAllUsers() {
        return userService.findAllEmployees();
    }

    @GetMapping("/id")
    public UserModel findById(@PathVariable("id")int id) {
        return userService.findById(id);
    }

    @PostMapping("/save")//Register?
    public UserModel saveUser(@RequestBody UserModel user) {
        return userService.saveUser(user);
    }

    @PostMapping("/update")
    public UserModel updateUser(@RequestBody UserModel user){return userService.updateUser(user);}

    @GetMapping("/delete")
    public void deleteUser(@RequestBody long id){userService.deleteUser(id);}

   /*
   @PostMapping("/login")
    public UserModel loginUser(@RequestBody LoginModel login) {
        return userService.validateUser(login);
    }
    */

}
