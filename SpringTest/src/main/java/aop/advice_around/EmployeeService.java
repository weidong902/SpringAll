package aop.advice_around;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-10 14:07
 **/
public interface EmployeeService {

    public void save(String name);

    public void delete(String name);

    public String query(String name);
}
