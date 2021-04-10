package aop.advice_around;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-10 14:12
 **/
public class AroundAdvice implements MethodInterceptor {
    //    @Override
    // jdk中动态代理: 参数1:当前代理对象. 参数2:当前执行方法对象  方法3: 参数
    // 参数:MethodInvocation :对象是spring对jdk动态代理的进一步封装.
    // MethodInvocation中包含: 当前代理对象\当前方法\目标对象\方法执行的参数
    /*public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("方法名: " + invocation.getMethod().getName());
        System.out.println("方法的参数: " + invocation.getArguments());
        System.out.println("目标对象" + invocation.getThis());
        // 放行去执行目标方法
        invocation.proceed();
        System.out.println("----目标方法执行之后----");

        return null;
    }*/
    @Override
    // jdk中动态代理: 参数1:当前代理对象. 参数2:当前执行方法对象  方法3: 参数
    // 参数:MethodInvocation :对象是spring对jdk动态代理的进一步封装.
    // MethodInvocation中包含: 当前代理对象\当前方法\目标对象\方法执行的参数
    public Object invoke(MethodInvocation invocation) throws Throwable {
//        System.out.println("方法名: " + invocation.getMethod().getName());
//        System.out.println("方法的参数: " + invocation.getArguments());
//        System.out.println("目标对象" + invocation.getThis());

        long start = System.currentTimeMillis();
        // 放行去执行目标方法
        Object proceed = invocation.proceed();

        System.out.println("----目标方法执行之后----");
        long end = System.currentTimeMillis();
        System.out.println("目标方法的执行时间为--> " + (end - start));

        return proceed;
    }
}
