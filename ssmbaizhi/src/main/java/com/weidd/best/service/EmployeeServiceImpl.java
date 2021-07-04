package com.weidd.best.service;

import com.weidd.best.mapper.EmployeeDao;
import com.weidd.best.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-07-04 22:51
 **/

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    @Override
    public void save(Employee employee) {
        employeeDao.save(employee);
    }

    @Override
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }
}
