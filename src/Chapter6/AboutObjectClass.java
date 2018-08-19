package Chapter6;

/**
 * 关于 Object 类的一些小知识
 * 所有类,都是继承自 Object类的
 */

interface OA {
    // 变量是作为静态使用
    public String age = "23";
    public void getInfo();
}

class OB implements OA {
    public String name = "hcy";
    public void getInfo() {
        System.out.println("Hello World!");
    }
}

public class AboutObjectClass {
    public static void main(String[] args) {
        OA a = new OB(); // 为接口实例化
        Object obj = a; // 对象向上转型 (父级)
        OA x = (OA) obj; // 向下转型 (子级)
        x.getInfo();


        //---------------

        int[] temp = {1,2,2,1};
        Object obj2 = temp;
        print(obj2);
    }

    public static void print(Object o) {
        if (o instanceof int[]) {
            int[] x = (int[]) o;
            for (int i : x) {
                System.out.println(i);
            }
        }
    }
}
