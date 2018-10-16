package Chapter13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *   范例，
 */

public class RelationDemo {
    public static void main(String[] args) {
        demo1();
    }

    // 一对多关系
    public static void demo1() {
        School sch = new School("清华大学");
        Student s1 = new Student("张三", 21);
        Student s2 =new Student("李四", 22);
        Student s3 = new Student("王五", 34);

        sch.getAllStudents().add(s1);
        sch.getAllStudents().add(s2);
        sch.getAllStudents().add(s3);

        s1.setSchool(sch);
        s2.setSchool(sch);
        s3.setSchool(sch);

        System.out.println(sch);
        // 实例化 Iterator 对象，用于输出全部学生信息
        Iterator<Student> iter = sch.getAllStudents().iterator();
        while (iter.hasNext()) {
            System.out.println("\t |- " + iter.next());
        }
    }
}

class School {
    private String name;
    private List<Student> allStudents;

    public School() {
        this.allStudents = new ArrayList<Student>();
    }

    public School (String name) {
        this();
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getAllStudents() {
        return allStudents;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                '}';
    }
}


class Student {
    private String name;
    private int age;
    private School school;

    public Student(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
