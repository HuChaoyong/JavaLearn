package Chapter11;

public class I18nDemo4 {
    public static void main(String[] args) {
        System.out.println("第一次运行: ");
        fun("LXH", "Li", "李兴华");
        System.out.println("第二次运行: ");
        Object[] arg = {"MLDN"};
        fun(arg);
    }

    public static void fun(Object ...args) {
        for (int i = 0; i < args.length; i ++) {
            System.out.println(args[i] + "、");
        }
    }
}
