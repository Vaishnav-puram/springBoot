package com.example.springDemo;
import com.example.springDemo.entities.User;
import com.example.springDemo.jpa.test.dao.UserRepo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(SpringDemoApplication.class, args);
		UserRepo userRepo=context.getBean(UserRepo.class);
//		User user=new User();
//		user.setCity("Bengaluru");
//		user.setName("Vaishnav");
//		user.setPhno("9248874978");
//
//		User user2=new User();
//		user2.setCity("Hyderabad");
//		user2.setName("Ajay");
//		user2.setPhno("9323556660");
//
//		//User user1=userRepo.save(user);
//		List<User>userList= List.of(user,user2);
//		//Iterable<User>userIterable= userRepo.saveAll(userList);
////		for(User u:userIterable) {
////			System.out.println(u.toString());
////		}
//
//		//update
//		Optional<User> optionalUser=userRepo.findById(103);
//		System.out.println(optionalUser);
//		User ou= optionalUser.get();
//		ou.setCity("Mumbai");
//		userRepo.save(ou);
//		System.out.println(ou);
//
//		//delete
//		userRepo.delete(ou);
		
		//custom finder methods
		System.out.println("********* custom finder methods ***********8");
		List<User> userList=userRepo.findByName("vaishnav");
		userList.forEach(e->System.out.println(e));
		List<User> userList1=userRepo.findByNameAndPhno("vaishnav","9248874978");
		userList1.forEach(e->System.out.println(e));

		//using JPQL (java persistent query language)
		System.out.println("************ java persistent query language ***********");
		List<User> userList2=userRepo.getAllUser();
		userList2.forEach(e->System.out.println(e));
		System.out.println();
		List<User> userList3=userRepo.getUserByName("Vaishnav");
		userList3.forEach(e->System.out.println(e));
		System.out.println();
		List<User> userList4=userRepo.getUser("Vaishnav","Bengaluru");
		userList4.forEach(e->System.out.println(e));
		System.out.println();
		List<User> userList5=userRepo.getAllUsers();
		userList5.forEach(e->System.out.println(e));
		System.out.println();
	}

}
