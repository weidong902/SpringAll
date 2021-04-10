package aop.advice_pointcut;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.*;

import java.lang.reflect.Method;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-09 23:41
 *
 * 前置通知     MethodBeforeAdvice
 * 后置通知     AfterReturningAdvice
 * 环绕通知     MethodInterceptor
 * 异常通知     ThrowsAdvice
 *
 *
 *
 **/
public class OrderAdvice implements MethodBeforeAdvice {
    @Override
    // 参数1:当前调用的目标方法  参数2:方法的参数  参数3:目标对象.
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("前置通知===========");
        System.out.println("method.getName()-->"+method.getName());
        System.out.println("方法参数"+args[0]);
        System.out.println("目标对象-- "+target);

    }

   /* @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {

    }*/

   /* @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        return null;
    }*/
}
