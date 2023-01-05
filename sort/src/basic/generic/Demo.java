package basic.generic;

import com.sun.security.jgss.GSSUtil;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class Demo {
    public static final Integer ONE = 1;

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        CatFather catFather = new Cat();
        catFather.eat();
    }
}
