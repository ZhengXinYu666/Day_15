package ListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
*    有一个集合，相判断有没有"world"这个元素，如果有就加一个"javaee"元素，写代码实现
*
*   并发修改：
*       当方法检测到对象的并发修改，但不允许这种修改的时候，抛出此异常
*   产生的原因：
*       迭代器是依赖于集合而存在的，在判断成功后，集合中新添加了元素，而迭代器却不知道，所以报错了
*       这个错误叫并发修改异常
*       其实这个问题描述的是迭代器遍历元素的时候，通过集合是不能修改元素的
*   如何解决呢？
*       a、使用迭代器迭代元素，迭代器修改元素
*           元素是跟在刚才迭代的元素后面的
*       b、集合遍历元素，集合修改元素(普通for)
*           元素在最后添加
*
* */
public class ListIteratorDemo2 {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("hello");
        list.add("world");
        list.add("java");

//        Iterator it = list.iterator();
//
//        while(it.hasNext()){
//            String s = (String) it.next();
//            if("world".equals(s)){
//                list.add("javaee");
//            }
//        }


        //迭代器迭代元素，迭代器修改元素
        //而Iterator没有该功能，所以使用子类接口ListIterator
//        ListIterator lit = list.listIterator();
//        while(lit.hasNext()){
//            String s = (String) lit.next();
//            if("world".equals(s)){
//                lit.add("javaee");
//            }
//        }


        //用集合遍历元素
        for(int x = 0; x<list.size();x++){
            String s = (String) list.get(x);
            if("world".equals(s)){
                list.add("javaee");
            }
        }



        System.out.println(list);
    }
}
