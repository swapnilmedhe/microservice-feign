package com.amdocs.userservice.service;

import com.amdocs.userservice.feignutils.FeignUtils;
import com.amdocs.userservice.model.User;
import com.amdocs.userservice.repo.UserRepo;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@Data
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
   private  FeignUtils feignUtils;
    public User saveUser(User user) {
        log.info("user added"+user);
        return userRepo.save(user);
    }

    public User findByUseruserId(Long id) {
        log.info("fetching user by id: "+id);
        return  userRepo.findByUserId(id);
    }

    public List<User> getAllUsers() {
        log.info("fetching All user ");
        return  userRepo.findAll();
    }

    public void deleteUser(Long id) {
        userRepo.delete(id);
    }
}
