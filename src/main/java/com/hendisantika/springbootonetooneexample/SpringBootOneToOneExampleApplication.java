package com.hendisantika.springbootonetooneexample;

import com.hendisantika.springbootonetooneexample.entity.Users;
import com.hendisantika.springbootonetooneexample.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootOneToOneExampleApplication {

    @Autowired
    UsersRepository usersRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootOneToOneExampleApplication.class, args);
    }

    @Bean
    CommandLineRunner initializeData() {
        return args -> {
            usersRepository.save(new Users("Uzumaki Naruto", 2500, "Team 7"));
            usersRepository.save(new Users("Sakura Haruno", 3500, "Team 7"));
            usersRepository.save(new Users("Uchiha Sasuke", 4500, "Team 7"));
            usersRepository.save(new Users("Sabaku No Gaara", 5500, "Team 1"));
            usersRepository.save(new Users("Inuzuka Kiba", 2600, "Team 2"));
        };
    }
}
