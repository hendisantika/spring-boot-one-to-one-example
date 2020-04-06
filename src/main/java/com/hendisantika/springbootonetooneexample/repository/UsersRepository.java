package com.hendisantika.springbootonetooneexample.repository;

import com.hendisantika.springbootonetooneexample.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-one-to-one-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 22/08/18
 * Time: 18.39
 * To change this template use File | Settings | File Templates.
 */
public interface UsersRepository extends JpaRepository<Users, Integer> {
    List<Users> findByName(String name);
}