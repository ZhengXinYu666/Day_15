package ListDemo;

import java.util.ArrayList;
import java.util.List;

/*
*   List集合的特有功能
*       a、添加功能
*           void add(int index, Object element)：在指定位置添加元素
*       b、获取功能
*           Object get(int index)：获取指定位置的元素
*       c、列表迭代器
*           ListIterator ListIterator()：List集合特有的迭代器
*       d、Object remove(int index)：根据索引删除元素，返回被删除的元素
*       e、Object set(int index,Object element)：根据索引修改元素，返回被修饰的元素
*
* */
public class ListDemo4 {
    public static void main(String[] args) {
//        a、添加功能
//        void add(int index, Object element)：在指定位置添加元素
        List list = new ArrayList();

        list.add("hello");
        list.add("world");
        list.add("java");


        list.add(1,"android");
        list.add(3,"javaee");
        list.add(5,"javaee");

        System.out.println(list.remove(1));


        System.out.println(list.set(1,"JAVA"));
        System.out.println("list"+list);

    }
}
