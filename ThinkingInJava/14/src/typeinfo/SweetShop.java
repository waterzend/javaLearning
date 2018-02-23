package typeinfo;

/**
 * Created by wangchunyu01 on 2018/2/13.
 */
class Candy {
    static {
        System.out.println("loding candy");
    }
}

class Gum {
    static {
        System.out.println("loading gum");
    }
}

class Cookie {
    static {
        System.out.println("loading cookie");
    }
}

public class SweetShop {
    public static void main(String[] args) {
        System.out.println("inside main");
        new Candy();
        new Candy();
        System.out.println("after creating candy");
        try {
            Class.forName("Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("could not find gum");

        }
       // new Gum();
        try {
            Class.forName("Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("could not find gum");

        }
        System.out.println("after class.forname gum");
        new Cookie();
        System.out.println("after creating cookie");

    }
}
