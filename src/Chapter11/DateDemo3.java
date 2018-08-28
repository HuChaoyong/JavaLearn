package Chapter11;

// DateFormat 类的操作

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateDemo3 {
    public static void main(String[] args) {
        DateFormat df1 = null;
        DateFormat df2 = null;
        df1 = DateFormat.getDateInstance(DateFormat.YEAR_FIELD, new Locale("zh", "CN"));
        df2 = DateFormat.getDateTimeInstance(DateFormat.YEAR_FIELD, DateFormat.ERA_FIELD, new Locale("zh", "CN"));
        System.out.println("Date: " + df1.format(new Date())); // 格式化日期
        System.out.println("Datetime: " + df2.format(new Date()));


    }
}
