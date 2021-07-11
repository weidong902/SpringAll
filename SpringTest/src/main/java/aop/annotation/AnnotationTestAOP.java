package aop.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-07-05 11:11
 **/
public class AnnotationTestAOP {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConf.class);
        Boy boy = context.getBean(Boy.class);
        Girl girl = context.getBean(Girl.class);
        boy.buy();
        girl.buy();
    }
}
