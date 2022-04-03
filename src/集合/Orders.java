package 集合;

public class Orders {
    public String name;

    //建立无参构造
    public Orders() {
        System.out.println("第一步 执行无参数构造方法创建bean");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("第二步  调用set方法设置属性");
    }

    public void initial(){
        System.out.println("第三步  执行初始化方法");
    }

    public void destroyMethod() {
        System.out.println("第五步 执行销毁的方法");
    }
}
