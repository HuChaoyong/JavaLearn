package Chapter11;

class Person {
    private String name;
    private int age;
    public Person(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public String toString() {
        return "姓名: " + name + ", 年龄" + " .";
    }

    public void finalize() throws Throwable {
        System.out.println("对象被释放 ===> " + this);
    }
}

public class SystemDemo3 {
    public static void main(String[] args) {
        Person per = new Person("李兴华", 35);
        per = null;
        System.gc();

        // 并不会执行 finalize 中的内容
    }
}
