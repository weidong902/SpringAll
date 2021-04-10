package aop.advice_around;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-10 14:09
 **/
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public void save(String name) {
        System.out.println("新增员工 "+ name);
    }

    @Override
    public void delete(String name) {
        System.out.println("删除员工 "+ name);

    }

    @Override
    public String query(String name) {
        System.out.println("查询员工 "+ name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return name;
    }
}
