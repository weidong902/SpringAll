package aop.advice_pointcut;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-10 00:20
 **/
public class Test2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("advice/advice.xml");
        OrderService orderService = (OrderService) context.getBean("orderService");
        System.out.println("===========================");
        orderService.save("奔波儿");
        System.out.println("===========================");
        System.out.println("orderService.getClass() -->"+orderService.getClass());
/**
 * ===========================
 * 前置通知===========
 * method.getName()-->save
 * 新增订单 奔波儿
 * ===========================
 * orderService.getClass() -->class com.sun.proxy.$Proxy3
 */

    }
}
