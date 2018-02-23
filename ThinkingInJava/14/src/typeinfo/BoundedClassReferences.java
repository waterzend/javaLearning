package typeinfo;

/**
 * Created by wangchunyu01 on 2018/2/23.
 */
public class BoundedClassReferences {
    public static void main(String[] args) {
        Class<? extends Number> bounded = int.class;
        bounded = double.class;
        bounded = Number.class;
    }
}
