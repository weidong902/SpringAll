package com.weidd.best.study.transactionaltest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-05-11 09:57
 **/
@Repository
public class PersonDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    //转出
    public void out(String fromName, int money) {
        String sql = "update person set money=money -? where name =?";
        jdbcTemplate.update(sql, money, fromName);

    }

    //转入
    public void in(String toName, int money) {
        String sql = "update person set money=money + ? where name =?";
        jdbcTemplate.update(sql, money, toName);
    }

}
