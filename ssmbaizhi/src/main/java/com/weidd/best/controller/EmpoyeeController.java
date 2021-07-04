package com.weidd.best.controller;

import com.weidd.best.pojo.Employee;
import com.weidd.best.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-07-04 18:53
 **/
@RestController
@RequestMapping("/emp")
public class EmpoyeeController {


    EmployeeService employeeService;

    @Autowired
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping("/save")
    public void save(Employee employee) {
        employeeService.save(employee);
    }

    @RequestMapping("/findAll")
    public List<Employee> findAll() {

        return employeeService.findAll();
    }

    /*public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeService bean = context.getBean(EmployeeService.class);

        Employee employee = new Employee();
        employee.setName("李四");
        employee.setBrithday(new Date());
        employee.setSalary(1000000L);
        bean.save(employee);

        bean.findAll().forEach(employee1 -> System.out.println(employee));

    }*/

}
