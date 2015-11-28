package com.example;

import javax.persistence.*;

/**
 * Created by Metju on 2015-10-31.
 */

@Entity
public class MyUser {
    public Integer id;
    public String login;
    public String password;

    public MyUser(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public MyUser(){

    }


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
