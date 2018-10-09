package Chapter13;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        demo1();

        demo2();
    }

    public static void demo1() {
        LinkedList<String> link = new LinkedList<String>();
        link.add("A");
        link.add("B");
        link.add("C");
        System.out.println("now link: " + link);
        link.addFirst("D");
        link.addLast("E");
        System.out.println("now link: " + link);
    }

    public static void demo2() {
        LinkedList<String> link = new LinkedList<String>();
        link.add("A");
        link.add("B");
        link.add("C");

        System.out.println("element() 方法找到表头： " + link.element());
        System.out.println("peek() 方法找到表头： " + link.peek());
        System.out.println("poll() 方法找到并删除表头： " + link.poll());
    }
}
