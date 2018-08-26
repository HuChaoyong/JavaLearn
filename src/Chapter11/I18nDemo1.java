package Chapter11;

import java.util.ResourceBundle;

// 如何读取属性文件

public class I18nDemo1 {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("Message");

        System.out.println("内容: " + rb.getString("info"));

    }
}
