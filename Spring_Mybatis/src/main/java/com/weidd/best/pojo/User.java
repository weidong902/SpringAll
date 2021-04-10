package com.weidd.best.pojo;

import java.util.Objects;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-10 19:31
 **/
public class User {
    private int id;
    private String name;
    private int age;
    private String addr;

    public User() {
    }

    public User(String name, int age, String addr) {
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                age == user.age &&
                name.equals(user.name) &&
                addr.equals(user.addr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, addr);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                '}';
    }


}
