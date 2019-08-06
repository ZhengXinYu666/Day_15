package ListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
*   List集合的特点：
*       有序(存储和去除的元素一致）、可重复的
*
* */
public class ListDemo2 {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("javaee");
        list.add("android");
        list.add("javaee");
        list.add("android");

        //遍历集合
        Iterator it = list.iterator();
        while(it.hasNext()){
            String s = (String) it.next();
            System.out.println(s);
        }
    }
}
