package aop.staticproxy.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-09 19:37
 **/
public class Test1 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop/aop.xml");
//        ProductService productService = (ProductService) context.getBean("productService");
        ProductService productService = (ProductService) context.getBean("productServiceProxy");
        productService.save("23123");
//        productService.update("21323");
//        productService.delete("23423");
//        productService.query("43252");

    }
}
