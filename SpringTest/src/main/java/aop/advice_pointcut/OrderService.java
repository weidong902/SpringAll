package aop.advice_pointcut;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-09 23:39
 **/
public interface OrderService {
    public void save(String name);
    public void delete(String name);
    public String query(String name);

}
