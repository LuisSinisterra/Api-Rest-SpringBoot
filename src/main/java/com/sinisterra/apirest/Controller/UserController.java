package com.sinisterra.apirest.Controller;

import com.sinisterra.apirest.Entity.User;
import com.sinisterra.apirest.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public void create(@RequestBody User user) {
        this.userService.create(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        this.userService.delete(id);
    }

    @GetMapping("/{id}")
    public Optional<User> getById(@PathVariable Integer id) {
        return this.userService.find(id);
    }

    @GetMapping
    public List<User> getAll() {
        return this.userService.findAll();
    }

    @PutMapping("/{id}")
    public void put(@PathVariable Integer id, @RequestBody User person) {
        this.userService.update(id, person);
    }

}
