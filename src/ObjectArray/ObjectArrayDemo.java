package ObjectArray;
/*
*   有五个学生
*       存入数组，遍历数组，得到每一个学生的信息
*   学生：Student
*   成员变量：name，age
*   构造方法：无参带参
*   成员方法：getXXX（）setXXX（）
*   存储学生的数组应该是什么样子的？
*
*   分析：
*       1、创建学生类
*       2、创建学生数组（对象数组）
*       3、创建五个学生对象，并赋值
*       4、把c步骤的元素放到数组中
*       5、遍历数组
* */
public class ObjectArrayDemo {
    public static void main(String[] args) {
        //创建学生数组（对象数组）
        Student[] student = new Student[5];

        //创建5个学生对象，并赋值
        Student s1 = new Student("花木兰",18);
        Student s2 = new Student("鲁班七号",3);
        Student s3 = new Student("韩信",8);
        Student s4 = new Student("李白",9);
        Student s5 = new Student("露娜",22);

        //将元素放入数组
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;
        student[3] = s4;
        student[4] = s5;

        //遍历
        for(int x = 0; x < student.length;x++){
            Student s = student[x];
            System.out.println(s.getName()+"-----"+s.getAge());
        }

    }
}
