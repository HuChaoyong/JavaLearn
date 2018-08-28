package Chapter11;

// 取得本机全部环境属性

public class SystemDemo2 {
    public static void main(String[] args) {
        // 列出所有属性
//        System.getProperties().list(System.out);

        // 获取部分属性
        System.out.println("操作系统是" + System.getProperty("os.name"));
        System.out.println("操作系统版本:" + System.getProperty("os.version"));
    }
}
