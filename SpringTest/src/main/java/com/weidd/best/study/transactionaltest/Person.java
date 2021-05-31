package com.weidd.best.study.transactionaltest;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-05-11 09:48
 **/
public class Person {
    private long id;
    private String name;
    private int money;

    public Person(int id, String name, int money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public Person() {
    }

    public long getId() {
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

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
