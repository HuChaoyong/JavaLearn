package Chapter11;

import java.util.ListResourceBundle;

public class Message_zh_CN extends ListResourceBundle {
    private final Object data[][]  = {
            {"info", "你好啊, {0}"}
    };

    public Object[][] getContents() {
        return data;
    }
}
