package com.hendisantika.springbootonetooneexample.controller;

import com.hendisantika.springbootonetooneexample.entity.Users;
import com.hendisantika.springbootonetooneexample.entity.UsersContact;
import com.hendisantika.springbootonetooneexample.repository.UsersContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-one-to-one-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 22/08/18
 * Time: 19.32
 * To change this template use File | Settings | File Templates.
 */

@RequestMapping("/rest/userscontact")
@RestController
public class UsersContactController {
    @Autowired
    private UsersContactRepository usersContactRepository;

    @GetMapping(value = "/all")
    public List<UsersContact> getUsersContact() {
        return usersContactRepository.findAll();
    }

    @GetMapping(value = "/update/{name}")
    public List<UsersContact> update(@PathVariable final String name) {

        UsersContact usersContact = new UsersContact();

        Users users = new Users();
        users.setTeamName("Development")
                .setSalary(10000)
                .setName(name);


        usersContact.setPhoneNo(11111)
                .setUsers(users);

        usersContactRepository.save(usersContact);

        return usersContactRepository.findAll();


    }
}
