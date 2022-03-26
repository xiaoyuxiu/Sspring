package One;

//用bean注入属性
public class Book {
    String author;
    String name;
    //利用set
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void add(){
        System.out.println("书的作者:"+author+"，书名："+name);
    }
}
