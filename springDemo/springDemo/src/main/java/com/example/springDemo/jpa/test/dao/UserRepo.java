package com.example.springDemo.jpa.test.dao;

import com.example.springDemo.entities.User;

import jdk.jfr.Percentage;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepo extends CrudRepository<User,Integer> {
    public List<User> findByName(String name);
    public List<User> findByNameAndPhno(String name,String phno);

    //JPQL Queries
    @Query("select u from User u")
    public List<User> getAllUser();
    @Query("select u from User u WHERE u.name =:n")
    public List<User> getUserByName(@Param("n") String name);
    @Query("select u from User u WHERE u.name =:n and u.city =:m")
    public List<User> getUser(@Param("n") String name,@Param("m") String city);

    @Query(value="select * from User",nativeQuery = true)
    public List<User> getAllUsers();
}
