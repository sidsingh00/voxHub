package com.voxHub.baithak.service;

import com.voxHub.baithak.entity.UserDetails;
import com.voxHub.baithak.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public UserDetails createData(UserDetails userDetails){
        return  userRepository.save(userDetails);
    }

}
