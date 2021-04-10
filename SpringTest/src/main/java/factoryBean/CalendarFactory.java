package factoryBean;

import org.springframework.beans.factory.FactoryBean;

import java.util.Calendar;

/**
 * @program: SpringAll
 * @author: weidd
 * @date: 2021-04-10 16:00
 * <p>
 * 日历类的工厂bean
 **/
public class CalendarFactory implements FactoryBean<Calendar> {

    @Override
    //用来创建复杂对象的创建方式
    public Calendar getObject() throws Exception {
        return Calendar.getInstance();
    }

    @Override
    //复杂对象的类型
    public Class<?> getObjectType() {
        return Calendar.class;
    }

    @Override
    //用来床架复杂对象的创建次数.单例
    public boolean isSingleton() {
        return true;
    }
}
