package autoWire;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import 集合.Course;

public class Text3 {
   @Test
        public void text1(){
            ApplicationContext context=new ClassPathXmlApplicationContext("au.xml");
            Dep c=context.getBean("dep", Dep.class);
            System.out.println(c);
        }

}
