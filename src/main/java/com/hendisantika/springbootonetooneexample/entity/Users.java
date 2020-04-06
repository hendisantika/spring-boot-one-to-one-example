package com.hendisantika.springbootonetooneexample.entity;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-one-to-one-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 22/08/18
 * Time: 18.37
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "users", catalog = "one2one")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Integer id;

    @Column(name = "name")
    private String name;

    private Integer salary;

    private String teamName;

    public Users() {
    }

    public Users(String name, Integer salary, String teamName) {
        this.name = name;
        this.salary = salary;
        this.teamName = teamName;
    }

    public Integer getId() {
        return id;
    }

    public Users setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Users setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getSalary() {
        return salary;
    }

    public Users setSalary(Integer salary) {
        this.salary = salary;
        return this;
    }

    public String getTeamName() {
        return teamName;
    }

    public Users setTeamName(String teamName) {
        this.teamName = teamName;
        return this;
    }
}

