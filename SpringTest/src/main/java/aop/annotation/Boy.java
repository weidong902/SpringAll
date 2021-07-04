package aop.annotation;

import org.springframework.stereotype.Component;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-06-29 14:18
 **/

@Component
public class Boy implements IBuy {
    @Override
    public String buy() {
        System.out.println("boy买游戏机");
        return "游戏机";
    }
}
