package ListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
*   需求：List集合存储字符串并遍历
* */
public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("hello");
        list.add("world");
        list.add("java");

        //遍历集合
        Iterator it = list.iterator();
        while(it.hasNext()){
            String s = (String) it.next();
            System.out.println(s);
        }
    }
}
