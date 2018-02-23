package typeinfo.toy;

/**
 * Created by wangchunyu01 on 2018/2/22.
 */
interface HasBatteries {
}

interface Waterproof {
}

interface Shoots {
}
interface Run{}

class Toy {
    Toy() {
    }

    Toy(int i) {
    }
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots,Run {
    FancyToy() {
        super(1);
    }
}

public class ToyTest {
    static void printInfo(Class cc) {
        System.out.println("class name:" + cc.getName() +
                " is interface?[" + cc.isInterface() + "]");
        System.out.println("simple name:" + cc.getSimpleName());
        System.out.println("canonical name:" + cc.getCanonicalName());
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("typeinfo.toy.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("cant find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for (Class face : c.getInterfaces()) {
            printInfo(face);
        }
        Class up = c.getSuperclass();
        Object obj = null;
        try {
            obj = up.newInstance();
        } catch (InstantiationException e) {
            System.out.println("cant instance");
            System.exit(1);
        }catch (IllegalAccessException e){
            System.out.println("cant acess");
            System.exit(1);
        }
        printInfo(obj.getClass());

    }
}
