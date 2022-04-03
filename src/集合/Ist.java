package 集合;

import org.springframework.beans.factory.config.ListFactoryBean;

import java.util.List;

public class Ist {
    public List<String> list;

    @Override
    public String toString() {
        return "Ist{" +
                "list=" + list +
                '}';
    }

    public void setList(ListFactoryBean list) {
    }
}
