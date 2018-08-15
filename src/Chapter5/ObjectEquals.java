package Chapter5;

/**
 * 基本的对象比较设计
 */

class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public boolean compare(Person per) {
        Person p1  = this;
        Person p2 = per;
        // 先比较地址,地址一样,就肯定一样了~!
        if (p2 == this) {
            return true;
        }

        // 然后,再依次比较每个属性
        if (p1.getAge() == p2.getAge() && p1.getName().equals(p2.getName())) {
            return true;
        } else {
            return false;
        }
    }

}

public class ObjectEquals {
    // 这个参数,是在 运行  java ObjectEquals 时,给的,比如
    //  java ObjectEquals aaa bbb ccc // 这就传了三个参数进去
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("参数不足3个!");
        } else {
            for (int i = 0; i < args.length; i++) {
                System.out.println("第 " + i + "个参数:" + args[i]);
            }
        }

        Person p1 = new Person("hcy", 24);
        Person p2 = new Person("hcy", 24);

        System.out.println("p1 == p2 ? " + p1.compare(p2));
    }
}
