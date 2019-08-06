package Collection;

import java.util.*;

public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add("abc1");
        c1.add("abc2");
        c1.add("abc3");
        c1.add("abc4");
        Collection c2 = new ArrayList();
        c2.add("abc4");
        c2.add("abc5");
        c2.add("abc6");
        c2.add("abc7");

        System.out.println(c1.addAll(c2));

        System.out.println(c1);
        System.out.println(c2);

        System.out.println(c1.retainAll(c2));
        System.out.println(c1);
        System.out.println(c2);
        //假设有两个集合做交集，最终结果保存在a中，b不变
        //返回值表示的是a是否发生改变

    }
}
