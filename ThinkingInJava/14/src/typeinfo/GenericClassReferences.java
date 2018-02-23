package typeinfo;

/**
 * Created by wangchunyu01 on 2018/2/23.
 */
public class GenericClassReferences {
    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class;
        //Class<Number> genericIntClass = int.class;
        genericIntClass = Integer.class;
        intClass = double.class;
        //genericIntClass = double.class;
    }
}
