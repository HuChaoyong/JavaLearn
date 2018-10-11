package Chapter13;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        demo1();

        demo2();

        demo3();
    }

    public static void demo1() {
        Set<String> allSet = new HashSet<String>();
        allSet.add("D");
        allSet.add("B");
        allSet.add("A");
        allSet.add("C");

        System.out.println("allSet: " + allSet);
    }

    public static void demo2() {
        // 这个 treeSet 是会排序的 set
        Set<String> allSet = new TreeSet<>();
        allSet.add("B");
        allSet.add("A");
        allSet.add("D");
        allSet.add("C");

        System.out.println("allSet: " + allSet);
    }

    public static void demo3() {
        Set<Person> allSet = new TreeSet<Person>();

        allSet.add(new Person("张三", 32));
        allSet.add(new Person("李四", 31));
        allSet.add(new Person("王五", 34));
        allSet.add(new Person("王五", 34));
        allSet.add(new Person("王五", 34));
        allSet.add(new Person("赵六", 35));

        System.out.println("Person allSet: " + allSet);
    }


}

// 因为 TreeSet中需要使用排序规则，所以，Person必须实现 Comparable 的接口， 用于比较
class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person per) {
        if (this.age > per.age) {
            return 1;
        } else if (this.age < per.age) {
            return -1;
        } else {
            // 这里返回 name的 比较， 是为了保证当 age相同时，name不同则不会被看成相同的对象，会被移除
            return this.name.compareTo(per.name);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // 为了判断两个相等的对象，还需要腹泻 equals方法
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof  Person)) {
            return false;
        }

        Person p = (Person) obj;

        if (this.name.equals(p.name) && this.age == p.age) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode () {
        return this.name.hashCode() * this.age;
    }

}