package factoryBean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-10 15:57
 **/
public class TestFactoryBean {

    public static void main(String[] args) {
        //简单类交给spring管理,可以直接配置组件交给spring管理.(简单类:可以直接new对象,或者)
        //复杂类该如何实现工厂管理呢?此时引入工厂类(复杂类:抽象类或接口,不能直接通过new对象去创建对象的类.)

        ApplicationContext context = new ClassPathXmlApplicationContext("factory/factory.xml");
        Calendar calendar = (Calendar) context.getBean("calendar");
        System.out.println("时间 - > " + calendar.getTime());


    }
}
