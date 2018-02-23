package typeinfo;

import java.util.Random;

/**
 * Created by wangchunyu01 on 2018/2/22.
 */
class Initable {
    static final int statctFinal = 47;
    static final int statctFinal2 = ClassInitialization.rand.nextInt(1000);

    static {
        System.out.println("Initializing Initable");
    }
}

class Initable2 {
    static  int statctNonFinal = 147;

    static {
        System.out.println("Initializing Initable2");
    }
}

class Initable3 {
    static  int statctNonFinal = 74;

    static {
        System.out.println("Initializing Initable3");
    }
}


public class ClassInitialization {
    public static Random rand = new Random(47);

    public static void main(String[] args) throws ClassNotFoundException {
        Class initable = Initable.class;
        System.out.println("after creating initable ref");
        System.out.println(Initable.statctFinal);
        System.out.println(Initable.statctFinal2);
        System.out.println(Initable2.statctNonFinal);
        Class initables = Class.forName("typeinfo.Initable3");
        System.out.println("after creating initable3 ref");
        System.out.println(Initable3.statctNonFinal);

    }
}
