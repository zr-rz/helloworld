package basic.generic;

public class Cat extends CatFather{
    @Override
    public void eat() {
        System.out.println("cat eat");
    }

    public void run() {
        System.out.println("run");
    }
}
