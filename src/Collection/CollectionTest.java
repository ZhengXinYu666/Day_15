package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
* 需求：
*   存储字符串并遍历
*
* 分析：
*   1、创建集合对象
*   2、创建字符串对象
*   3、把字符串对象添加到集合中
*   4、遍历集合
* */
public class CollectionTest {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("刘备");
        c.add("关羽");
        c.add("张飞");
        c.add("公孙离");
        c.add("孙尚香");

        //遍历集合
        Iterator it = c.iterator();
        //通过迭代器对象的hasNext(）方法判断有没有
        while(it.hasNext()){
            //通过迭代器对象的next()获取元素
            String s = (String) it.next();
            System.out.println(s);

        }


    }
}
