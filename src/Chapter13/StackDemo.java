package Chapter13;

import java.util.Stack;

/**
 *  栈类
 *   先进后出，
 */

public class StackDemo {
    public static void main(String[] args) {
        demo1();
    }

    public static void demo1() {
        Stack<String> s = new Stack<String>();
        s.push("A"); // 入栈
        s.push("B");
        s.push("C");

        System.out.println("栈为空？ " + s.empty());

        System.out.println(s.pop() + "、"); // 出栈

        System.out.println("查看栈顶： " + s.peek());
        System.out.println(s.pop() + "、");
        System.out.println(s.pop() + "、");
        System.out.println("栈为空？ " + s.empty());
    }

}
