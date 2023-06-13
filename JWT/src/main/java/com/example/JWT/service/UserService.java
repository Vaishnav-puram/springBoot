package com.example.JWT.service;

import com.example.JWT.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User>  userList=new ArrayList<>();

    public UserService(){
        userList.add(new User(UUID.randomUUID().toString(),"vaishnav","vaishnav@gmail.com"));
        userList.add(new User(UUID.randomUUID().toString(),"vijay","vijay@gmail.com"));
        userList.add(new User(UUID.randomUUID().toString(),"ajay","ajay@gmail.com"));
        userList.add(new User(UUID.randomUUID().toString(),"shnaker","shanker@gmail.com"));

    }

    public  List<User> getUserList(){
        return this.userList;
    }
}
