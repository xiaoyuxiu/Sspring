package One;

public class UserService {
    UserDao u;
    public UserService(UserDao u){
        this.u=u;
    }
    public void add(){
        System.out.println("service is.......");
        u.addDao();
    }

}
