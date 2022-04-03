package autoWire;

public class Dep {
    public String Emp;

    public void setEmp(String emp) {
        Emp = emp;
    }

    @Override
    public String toString() {
        return "Dep{" +
                "Emp='" + Emp + '\'' +
                '}';
    }
}
