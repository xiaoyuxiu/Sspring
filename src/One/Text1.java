package One;
//Test可以有多个测试方法
//Test的使用 是该方法可以不用main方法调用就可以测试出运行结果，是一种测试方法，
//一般函数都需要有main方法调用才能执行，注意被测试的方法必须是public修饰的。
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.ResolvableType;
import 集合.Course;
import 集合.MyBean;
import 集合.Stu;

public class Text1 {
    @Test
    public void test(){
        //1、加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("TextOne.xml");
        //2、获取对象
        TextDemo1 eee = context.getBean("eee", TextDemo1.class);
        System.out.println(eee);
        eee.add();

    }
    @Test
    public void text1(){
        ApplicationContext context1=new ClassPathXmlApplicationContext("Book.xml") ;
        Book book = context1.getBean("book", Book.class);
        System.out.println(book);
        book.add();
    }

    @Test
    public void text2(){
        ApplicationContext context1=new ClassPathXmlApplicationContext("TextOne.xml") ;
        Cloth cloth = context1.getBean("cloth", Cloth.class);
        System.out.println(cloth);
        cloth.add();
    }

    @Test
    public void text3(){
        ApplicationContext context2=new ClassPathXmlApplicationContext("bean1.xml");
        Book p=context2.getBean("book",Book.class);
        System.out.println(p);
        p.add();
    }

    @Test
    public void text4(){
        ApplicationContext context=new ClassPathXmlApplicationContext("waibuBean.xml");
        UserService userService=context.getBean("userService",UserService.class);
        System.out.println(userService);
        userService.add();
    }

    @Test
    public void text5(){
        ApplicationContext context=new ClassPathXmlApplicationContext("neibuBean.xml");
        Emp department=context.getBean("emp",Emp.class);
        System.out.println(department);
        department.toString();
    }

    @Test
    public void text6(){
        ApplicationContext context=new ClassPathXmlApplicationContext("级联赋值2.xml");
        Emp department=context.getBean("emp",Emp.class);
        System.out.println(department);
        department.toString();
    }

    public static void main(String[] args) {
        Dao dao=ClassFactory.getDao();
        dao.out();
    }
}
