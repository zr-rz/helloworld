package basic.generic;

public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("i");
    }

    public void say() {
        System.out.println("h");
    }
}
