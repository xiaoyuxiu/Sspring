package 集合;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu {
    //数组
    String[] coures;
    public List<String> list;
    public Map<String,String> map;
    public Set<String> sets;
    public List<Course> list1;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setCoures(String[] coures) {
        this.coures = coures;
    }

    public void setList1(List<Course> list1) {
        this.list1 = list1;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }


    @Override
    public String toString() {
        return "Stu{" +
                "coures=" + Arrays.toString(coures) +
                ", list=" + list +
                ", map=" + map +
                ", sets=" + sets +
                ", list1=" + list1 +
                '}';
    }
    public void test(){
        System.out.println(list);
    }
}
