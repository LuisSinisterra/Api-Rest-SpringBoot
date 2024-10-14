package com.sinisterra.apirest.Service;

import com.sinisterra.apirest.Entity.User;
import com.sinisterra.apirest.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepositoryitory;

    public void create(User person) {
        this.userRepositoryitory.save(person);
    }

    public Optional<User> find(Integer id) {
        return this.userRepositoryitory.findById(id);
    }

    public List<User> findAll(){
        return userRepositoryitory.findAll();
    }

    public void delete(Integer id) {
        this.userRepositoryitory.deleteById(id);
    }

    public void update(Integer id, User user) {
        user.setId(id);
        this.userRepositoryitory.save(user);
    }

}
