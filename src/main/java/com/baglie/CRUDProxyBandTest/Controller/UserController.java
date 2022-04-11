package com.baglie.CRUDProxyBandTest.Controller;

import com.baglie.CRUDProxyBandTest.Entity.User;
import com.baglie.CRUDProxyBandTest.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/getUsers")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @PatchMapping("/updateUser/{id}")
    public User updateUser(@PathVariable int id,
                           @RequestBody User user) {
        return userService.updateUser(user, id);
    }

    @DeleteMapping("deleteUser/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.deleteUserById(id);
    }
}
