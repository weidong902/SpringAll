package aop.dynamicproxy;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-09 18:44
 **/

public interface ProductService {
    /**
     * 测试spring的AOP特性
     * 面向切面编程:目标对象被代理的对象
     * @param id
     */
    public void save(String id);
    public void update(String id);
    public void delete(String id);
    public String query(String id);

}
