import java.util.ArrayList;
import java.util.List;

/**
 * Created by longjinwen on 15/05/2017.
 */
public class ShareData {
    //像String、Integer、Long这些，都是final类型的类，任何一个线程都改变不了它们的值，要改变除非新创建一个
    // 因此这些不可变对象不需要任何同步手段就可以直接在多线程环境下使用
    public static final int COUNT=100;
    public List<Cat> listCats = new ArrayList<Cat>();
}
class Cat{
    private String name;
    private String age;
}
