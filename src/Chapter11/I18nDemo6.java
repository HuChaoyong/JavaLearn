package Chapter11;

// 使用资源文件类,代替资源文件


import java.util.*;
import java.text.*;

public class I18nDemo6 {
    public static void main(String[] args) {
        // 表示中国地区
        Locale zhLoc = new Locale("zh", "CN");
        // 找到中文的属性文件
        ResourceBundle zhrb = ResourceBundle.getBundle("Chapter11.Message", zhLoc);
        // 依次读取各个属性文件的内容,通过键值读取.
        String str1 = zhrb.getString("info");
        System.out.println("中文: " + MessageFormat.format(str1, "李兴华"));
    }
}


