package Chapter11;

import java.util.*;

// 国家化设置

public class I18nDemo2 {
    public static void main(String[] args) {
        Locale zhLoc = new Locale("zh", "CN");
        Locale enLoc = new Locale("en", "US");
        Locale frLoc = new Locale("fr", "FR");

        // 找到属性文件
        ResourceBundle zhrb = ResourceBundle.getBundle("Message", zhLoc);
        ResourceBundle enrb = ResourceBundle.getBundle("Message", enLoc);
        ResourceBundle frrb = ResourceBundle.getBundle("Message", frLoc);

        System.out.println("中文: " + zhrb.getString("info"));
        System.out.println("英文: " + enrb.getString("info"));
        System.out.println("法文: " + frrb.getString("info"));
    }
}
