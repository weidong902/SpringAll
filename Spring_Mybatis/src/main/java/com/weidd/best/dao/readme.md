# sm整合
### SM整合步骤
* 引入依赖 mysql\spring-jdbc\mybatis\mybatis-spring\druid
* 建表
* 创建实体类
* dao接口
* mapper文件注册 classpath:com/weidd/best/dao/UserDaoMapper.xml
* 编写spring配置文件
    * 将SQLSessionFactory对象交给Spring容器
    * 引入DataSource数据源对象
    * 引入mapper文件
    
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <!--1\创建SQLSessionFactory  需要两个属性:DataSource\ mapperLocations-->
    <bean id="sqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
        <property name="dataSource" ref="dataSource"></property>
        <property name="mapperLocations" value="classpath:com/weidd/best/dao1/ProductDaoMapper.xml"></property>
    </bean>
    <!--2\创建DataSource-->
    <bean id="dataSource" class="com.alibaba.druid.pool.DruidDataSource">
        <property name="driverClassName" value="com.mysql.jdbc.Driver"></property>
        <property name="url" value="jdbc:mysql://localhost:3306/mysqlStudy"></property>
        <property name="username" value="root"></property>
        <property name="password" value="3.014/*-+"></property>
    </bean>
    <!--创建Dao-->
    <bean id="productDao" class="org.mybatis.spring.mapper.MapperFactoryBean">
        <property name="sqlSessionFactory" ref="sqlSessionFactory"></property>
        <property name="mapperInterface" value="com.weidd.best.dao1.ProductDao"></property>
    </bean>
</beans>
```    


