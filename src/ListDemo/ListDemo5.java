package ListDemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo5 {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("hello");
        list.add("world");
        list.add("java");

//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
        //System.out.println(list.get(3));越界

        //用循环改进
        for(int x = 0; x < list.size(); x++){
            //System.out.println(list.get(x));
            String s = (String) list.get(x);
            System.out.println(s);
        }
    }
}
