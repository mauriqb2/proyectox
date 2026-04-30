package com.catolica.proyectox.controller;

import com.catolica.proyectox.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @GetMapping("/user")
    public List<User> getAllUsers() {
        return List.of(
                new User(8016330, "Filoberto", "Mamani", 87),
                new User(8016341, "Ruperto", "Mamani", 87),
                new User(8016324, "Filemona", "Mamani", 87),
                new User(8016334, "Ramses", "Mamani", 87),
                new User(8016323, "Fernando", "Mamani", 87)
        );
    }
}
