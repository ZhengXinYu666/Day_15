package Collection;

import java.util.*;

/*
*   迭代器
*   Iterator iterator()迭代器，集合专用遍历方式
*   Object next()：获取元素,并移动到下一个位置
*       NoSuchElementException：没有这样的元素，因为你已经找到最后了
*
* */
public class CollectionDemo4 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("hello");
        c.add("world");
        c.add("java");
        //迭代器，集合专用的遍历方式
        Iterator it = c.iterator();//实际返回肯定是子类对象，这里是多态

//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());

        //最后一个不应该写，在每次获取之前，写一个判断
        //判断是否有下一个元素，有就获取，没有就不管
        while(it.hasNext()){
//            System.out.println(it.next());
            String s = (String)it.next();
            System.out.println(s);
        }

    }
}
