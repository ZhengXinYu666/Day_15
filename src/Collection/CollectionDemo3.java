package Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
*   集合的遍历
*       以此获取集合中的每一个元素
*       Object[] toArray()：把集合转成数组，可以实现集合的遍历
* */
public class CollectionDemo3 {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        c.add("hello");
        c.add("world");
        c.add("java");

        //遍历
        Object[] objs = c.toArray();
        for(int x = 0; x < objs.length;x++){
//            System.out.println(objs[x]);
            //Object中没有length()方法
            //要把元素还原成字符串
            String s = (String) objs[x];
            System.out.println(s+"---"+s.length());
        }
    }
}
