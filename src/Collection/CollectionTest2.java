package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Collection;

/*
*   需求：存储自定义对象并遍历Student(name,age)
*
*   分析：
*   1、创建学生类
*   2、创建集合对象
*   3、创建学生对象
*   4、把学生对象添加到集合对象中
*   5、遍历集合
*
* */
public class CollectionTest2 {
    public static void main(String[] args) {
        //创建集合对象
        Collection c = new ArrayList();

        //创建学生对象
        Student s1 = new Student("貂蝉",21);
        Student s2 = new Student("小乔",23);
        Student s3 = new Student("黄月英",27);
        Student s4 = new Student();
        s4.setName("大乔");
        s4.setAge(26);

        //添加到结合对象中
        c.add(s1);
        c.add(s2);
        c.add(s3);
        c.add(s4);
        c.add(new Student("孙尚香",18));//匿名对象

        //遍历集合
        Iterator it = c.iterator();
        while(it.hasNext()){
            Student s = (Student) it.next();
            System.out.println(s.getName()+"----"+s.getAge());
        }


    }
}
