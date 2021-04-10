package aop.advice_around;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-10 14:20
 **/
public class Test3 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("around/around.xml");
        EmployeeService employeeService = (EmployeeService) context.getBean("employeeService");
        String query = employeeService.query("员工1");
        System.out.println(query);
        System.out.println(employeeService.getClass());
    }
}
