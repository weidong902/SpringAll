package aop.annotation;

import org.springframework.stereotype.Component;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-06-29 14:19
 **/
@Component
public class Girl implements IBuy {
    @Override
    public String buy() {
        System.out.println("girl 买衣服 ");
        return "买衣服" +
                "";
    }
}
