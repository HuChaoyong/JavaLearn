package Chapter6;

class Person {
    private void print() {
        System.out.println("Person => void print()");
    }

    public void fun() {
        this.print();
    }
}

// 子类覆写方法
class Student extends Person {
    void print() {
        System.out.println("Student => void print()");
    }
}

public class ExtendsDemo1 {
    public static void main(String[] args) {
        new Student().fun();
    }
}
