package Chapter5;

/**
 * 代码块的执行;
 *
 *   1. 静态代码块永远只执行一次,并且要优先于其他代码块执行
 *
 *   2. 在 Java1.6 中: 打印HelloWorld 可以不需要 主函数, 直接在 静态代码块里面就可以了. 不过执行后要退出,避免去找主方法
 *      但是,在 1.8 里面会报错,说找不到主函数
 */

class CodeBlockDemo {
    static {
        System.out.println("0 load static code ");
    }

    {
        System.out.println("1 load ordinary code ");
    }

    public CodeBlockDemo() {
        System.out.println("2 load constructor code ");
    }
}

public class CodeBlock {
    static {
        System.out.println("load main static code block");
        System.exit(1); // 正常退出
    }

//    public static void main(String[] args) {
//        CodeBlockDemo c1 = new CodeBlockDemo();
//        CodeBlockDemo c2 = new CodeBlockDemo();
//    }
}
