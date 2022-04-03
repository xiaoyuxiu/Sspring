package 集合;

import One.Book;
import One.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Text2 {
    //IOC操作Bean管理（xml注入集合属性）
    @Test
    public void text1(){
        ApplicationContext context=new ClassPathXmlApplicationContext("集合属性.xml");
        Stu department=context.getBean("stu", Stu.class);
        System.out.println(department);
        department.toString();
    }
    //IOC操作Bean管理（FactoryBean）
//    @Test
//    public void text2(){
//        ApplicationContext context=new ClassPathXmlApplicationContext("bean7.xml");
//        Ist mmm=context.getBean("ist", Ist.class);
//        System.out.println(mmm);
//
//    }

    //IOC操作Bean管理（bean作用域）
    @Test
    public void text3(){
        ApplicationContext context=new ClassPathXmlApplicationContext("Book.xml");
        Book book=context.getBean("book", Book.class);
        Book book1=context.getBean("book",Book.class);
        System.out.println(book);
        System.out.println(book1);
    }
    //Bean生命周期 ClassPathXmlApplicationContext有close方法
    @Test
    public void text4(){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean3.xml");
        Orders o=context.getBean("order",Orders.class);
        System.out.println("第四步 获取Bean对象");
        System.out.println(o);
        //手动让 bean 实例销毁
        context.close();
    }
    @Test//IOC操作Bean管理（FactoryBean）
    public void text5(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");
        Course c=context.getBean("myBean", Course.class);
        System.out.println(c);
    }
    @Test
    public void text6(){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean3.xml");
        MyBeanPost c=context.getBean("myBeanPost", MyBeanPost.class);
        System.out.println("第四步 获取Bean对象");
        System.out.println(c);
        context.close();
    }
    @Test
    public void text7(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean4.xml");
        Emp c=context.getBean("emp", Emp.class);
        System.out.println(c);

    }
}
