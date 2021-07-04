package com.weidd.best.service;

import com.weidd.best.pojo.Employee;

import java.util.List;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-07-04 22:51
 **/
public interface EmployeeService {
    void save(Employee employee);

    List<Employee> findAll();
}
