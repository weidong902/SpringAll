package aop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-07-05 11:15
 **/
@Aspect
@Component
public class BuyAspectJ {

    @Before("execution(* aop.annotation.IBuy.buy(..))")
    public void doSomethingBefore() {
        System.out.println("做个日志打印吧,实现AOP的功能");
    }
}
