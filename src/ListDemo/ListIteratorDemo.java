package ListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
*   List特有的迭代器
*   列表迭代器
*       该迭代器继承了Iterator迭代器，所以，就可以直接使用hasNext()和next()方法
*   特有功能：
*       Object previous()：获取上一个元素
*       boolean hasPrevious()：判断是否由元素
*
*   注意：ListIterator可以实现逆向遍历，但是必须先正向遍历，所以一般无有意义，一般不使用
* */
public class ListIteratorDemo {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("hello");
        list.add("world");
        list.add("java");

        ListIterator lis = list.listIterator();//子类对象
        while(lis.hasNext()) {
            String s = (String) lis.next();
            System.out.println(s);
        }
        //迭代器
        Iterator it = list.iterator();
        while(it.hasNext()){
            String s = (String) it.next();
            System.out.println(s);
        }
    }
}
