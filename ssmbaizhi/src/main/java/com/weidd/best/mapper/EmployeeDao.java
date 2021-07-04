package com.weidd.best.mapper;

import com.weidd.best.pojo.Employee;

import java.util.List;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-07-04 22:46
 **/
public interface EmployeeDao {
    void save(Employee employee);
    List<Employee> findAll();

}
