package aop.dynamicproxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-09 19:37
 **/
public class Test1 {

    public static void main(String[] args) {
        // 被代理对象
        ProductService productService = new ProductServiceImpl();

        ClassLoader loader = Thread.currentThread().getContextClassLoader();// 参数1:当前线程的类加载器
        Class<?>[] interfaces = {ProductService.class};//参数2:目标对象的接口类型的数组
//        InvocationHandler handler;// 参数3:通过代理对象调用代理中方法时会优先执行回调对象中的invoke方法.
//        在invoke方法中调用目标对象的方法,方法执行后还会回到invoke方法
        ProductService proxyInstance = (ProductService) Proxy.newProxyInstance(loader, interfaces, new InvocationHandler() {
            @Override
            //参数1:当前生成的代理对象
            // 参数2:当前代理对象的调用的方法对象
            // 参数3: 当前代理对象调用的方法对象传递的参数.
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                System.out.println("开启事务");
                System.out.println("method--->" + method.getName());
                System.out.println("进入invoke方法");
                // 调用真正业务逻辑对象,目标对象.
                //参数1:执行那个类中的方法, 参数2:执行当前方法的参数.
                Object invoke = method.invoke(productService, args);

                System.out.println("提交事务");
                System.out.println("目标方法执行完成");
                return invoke;
            }
        });
        // 通过动态代理UI想调用代理中的方法
//        proxyInstance.save("34234");
        String query = proxyInstance.query("小黑");
        System.out.println("动态代理返回值: == " + query);
    }
}
