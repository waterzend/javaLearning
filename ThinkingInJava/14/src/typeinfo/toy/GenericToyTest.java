package typeinfo.toy;

/**
 * Created by wangchunyu01 on 2018/2/23.
 */
public class GenericToyTest {
    public static void main(String[] args) throws Exception{
        Class<FancyToy> ftClass =FancyToy.class;
        FancyToy fancyToy=ftClass.newInstance();
        Class<? super FancyToy> up =ftClass.getSuperclass();
        Object object =up.newInstance();
    }
}
