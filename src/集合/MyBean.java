package 集合;

import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean {
    @Override
    public Course getObject() throws Exception {
        Course course=new Course();
        course.setName("Java");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
