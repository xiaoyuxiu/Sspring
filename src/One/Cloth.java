package One;

public class Cloth {
    int size;
    String color;

    public Cloth(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public void add(){
        System.out.println("这件衣服是"+color+",尺码是"+size);
    }
}
