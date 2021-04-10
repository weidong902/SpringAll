package aop.staticproxy.service;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-09 19:35
 *
 * 代理对象类:proxy 静态代理.
 * 在运行之前手动的为目标对象开发一个代理对象,然后通过代理对象执行相关方法的过程
 **/
public class ProductServiceStaticProxyImpl implements ProductService {

    private ProductService productService;

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public void save(String id) {
        System.out.println("新增方法的日志打印..........");
        productService.save(id);

    }

    @Override
    public void update(String id) {
        System.out.println("更新方法的日志打印..........");
        System.out.println("更新商品");

    }

    @Override
    public void delete(String id) {
        System.out.println("删除商品");
    }

    @Override
    public String  query(String id) {
        System.out.println("查询商品");
        return id;
    }
}
