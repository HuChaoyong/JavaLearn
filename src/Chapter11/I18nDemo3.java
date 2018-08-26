package Chapter11;

import java.text.MessageFormat;
import java.util.*;

public class I18nDemo3 {
    public static void main(String[] args) {
        Locale zhLoc = new Locale("zh", "CN");
        Locale enLoc = new Locale("en", "US");
        Locale frLoc = new Locale("fr", "FR");

        // 找到属性文件
        ResourceBundle zhrb = ResourceBundle.getBundle("Message", zhLoc);
        ResourceBundle enrb = ResourceBundle.getBundle("Message", enLoc);
        ResourceBundle frrb = ResourceBundle.getBundle("Message", frLoc);

        System.out.println("中文: " + MessageFormat.format(zhrb.getString("name"), "李兴华"));
        System.out.println("英文: " + MessageFormat.format(enrb.getString("name"), "李兴华"));
        System.out.println("法文: " + MessageFormat.format(frrb.getString("name"), "李兴华"));
    }
}
