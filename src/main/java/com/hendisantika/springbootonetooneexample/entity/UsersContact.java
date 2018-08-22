package com.hendisantika.springbootonetooneexample.entity;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-one-to-one-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 22/08/18
 * Time: 18.38
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "users_contact", catalog = "test")
public class UsersContact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    private Integer phoneNo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private Users users;

    public UsersContact() {
    }

    public Users getUsers() {
        return users;
    }

    public UsersContact setUsers(Users users) {
        this.users = users;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public UsersContact setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getPhoneNo() {
        return phoneNo;
    }

    public UsersContact setPhoneNo(Integer phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }
}