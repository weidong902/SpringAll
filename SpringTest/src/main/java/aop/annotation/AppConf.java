package aop.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.HashMap;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-06-29 14:20
 **/

@Configuration
@ComponentScan(basePackages = "aop.annotation")
@EnableAspectJAutoProxy(proxyTargetClass = true) // 启用了 AOP 功能，参数proxyTargetClass的值设为了 true 。默认值是 false
public class AppConf {


    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 10; i >= 0; i--) {
            map.put(i, i);
        }
    }
}
