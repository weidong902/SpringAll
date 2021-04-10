package aop.dynamicproxy;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-09 19:35
 * 目标对象:target对象
 **/
public class ProductServiceImpl implements ProductService {
    @Override
    public void save(String id) {
        System.out.println("新增商品" + id);
    }

    @Override
    public void update(String id) {
        System.out.println("更新商品");
    }

    @Override
    public void delete(String id) {
        System.out.println("删除商品");
    }

    @Override
    public String query(String id) {
        System.out.println("查询商品");
        return id;
    }
}
