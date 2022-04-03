package One;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class ClassFactory {
   // public  Dao dao;
    //IOC底层
    public static Dao getDao()  {
        //找到配置文件
        ClassPathResource name=new ClassPathResource("TextOne.xml");
        //加载配置文件
        BeanFactory beanFactory=new XmlBeanFactory(name);
        //getBean取出实例pring通过在配置文件中配置<bean>元素，将一个对象交给IOC容器，
        // 然后通过反射机制创建这个对象的实例（操作都是用实例进行的），而在用的时候，
        // 只需要获取这个<bean>元素就可以拿到这个对象的实例，然后进行后续的操作。
        //相当于Class.forname.newInstance
        Dao dao=beanFactory.getBean("dao",Dao.class);
        return dao;
    }

//    public void main(String[] args) {
//        dao.out();
//    }

}
