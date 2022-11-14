import de.tiere.Schwein;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception{

        // 1. Methode
        Class clazz = Schwein.class;

        // 2. Methode
        Schwein piggy = new Schwein();
        clazz = piggy.getClass();

        // 3. Methode
        clazz = Class.forName("de.tiere.Schwein");

        System.out.println(clazz.getName());

        Method [] methods = clazz.getMethods();
        for (Method m: methods) {
            System.out.println(m.getName());
        }
        System.out.println("----------------");
        methods = clazz.getDeclaredMethods();
        for (Method m: methods) {
            System.out.println(m.getName());
        }

        Object object = clazz.getConstructor().newInstance();
        System.out.println(object);

        Method m = clazz.getMethod("fressen");

        m.invoke(object);
        System.out.println(object);

        m = clazz.getDeclaredMethod("setGewicht", int.class);
        m.setAccessible(true);
        m.invoke(object, -100);
        System.out.println(object);

    }
}