package typeinfo;

/**
 * Created by wangchunyu01 on 2018/2/23.
 */
public class WildcardClassReference {
    public static void main(String[] args) {
        Class<?> intClass = int.class;
        intClass = double.class;
    }
}
