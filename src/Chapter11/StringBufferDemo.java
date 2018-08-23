package Chapter11;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer buf = new StringBuffer();
        String str = "my String";
        buf.append("Hello ");

        fun1(buf);
        fun2(str);



        System.out.println(buf);
        System.out.println(str);
    }

    public static void fun1(StringBuffer sb) {
        sb.append("add string");
    }
    public static void fun2(String sb) {
        sb += "add new String";
    }
}
