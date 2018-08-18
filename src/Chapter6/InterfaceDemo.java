package Chapter6;

interface AI {
    public String AHTHOR = "HCY";
    public void print();
    public String getInfo();
}

class X implements AI {

    public void print() {
        System.out.println("打印!");
    }

    public String getInfo() {
        return "hello world!";
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        X x = new X();
        x.print();
        System.out.println(x.getInfo());
    }
}
