package aop.advice_pointcut;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-09 23:40
 **/
public class OrderServiceImpl  implements OrderService{
    @Override
    public void save(String name) {
        System.out.println("新增订单 "+ name);
    }

    @Override
    public void delete(String name) {
        System.out.println("删除订单 "+ name);

    }

    @Override
    public String query(String name) {
        System.out.println("查询订单 "+ name);
        return name;
    }
}
