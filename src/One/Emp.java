package One;

public class Emp {
    String ename;
    String gender;
    public Department department;
    public Department getDepartment(){
        return department;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "ename='" + ename + '\'' +
                ", gender='" + gender + '\'' +
                ", department=" + department.toString() +
                '}';
    }



}
