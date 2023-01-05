package basic.generic;

public class GenericDemo {
    public static void main(String[] args) {
        Generic<String> stringGeneric = new Generic<>("a", "b");
        Generic<String> stringGeneric1 = Generic.create("a", "c");
        System.out.println(stringGeneric1.getFirst());
        System.out.println(stringGeneric.getLast());
        Class<String> stringClass = String.class;
        String s = null;
        try {
            s = stringClass.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(s.length());
        System.out.println(1);
    }
}
