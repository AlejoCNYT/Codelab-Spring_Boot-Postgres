package com.example.demo.data.web;

import com.example.demo.data.dto.UserDto;
import com.example.demo.data.entity.User;
import com.example.demo.data.exception.UserNotFoundException;
import com.example.demo.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public User createUser(@RequestBody UserDto userDto) {
        User user = new User(userDto);
        return userRepository.save(user);
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) return optionalUser.get();
        throw new UserNotFoundException();
    }
}
