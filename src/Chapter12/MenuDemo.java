package Chapter12;

import javax.net.ssl.SSLContext;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 这里需要完成一个菜单栏的操作
 */

public class MenuDemo {
}

class Operate {
    public static void add() {
        System.out.println("**选择的是增加");
    }
    public static void delete() {
        System.out.println("**选择的是删除");
    }
    public static void update() {
        System.out.println("**选择的是更新");
    }
    public static void find() {
        System.out.println("**选择的是查找");
    }
}

class Menu {
    public Menu() {
        while (true) {
            this.show();
        }
    }

    public void show() {
        System.out.println("==============简单系统=============");
        System.out.println("     [1] 增加数据");
        System.out.println("     [2] 删除数据");
        System.out.println("     [3] 修改数据");
        System.out.println("     [4] 查询数据");
        System.out.println("     [0] 退出系统");
//        InputData input = new InputData();
//        int i = input.getInt("请选择： ", "请输入正确的选项！");
        int i = 0;
        switch (i) {
            case 1: {
                Operate.add();
                break;
            }
            case 2: {
                Operate.delete();
                break;
            }
            case 3: {
                Operate.update();
                break;
            }
            case 4: {
                Operate.find();
                break;
            }
            case 0: {
                System.exit(1);
                break;
            }
            default: {
                System.out.println("请选择正确的操作！");
            }
        }
    }
}


class InputData {
    private BufferedReader buf = null;
    public InputData() {
        this.buf = new BufferedReader(new InputStreamReader(System.in));
    }

    public String getString(String info) {
        String temp = null;
        System.out.print(info);
        try {
            temp = this.buf.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return temp;
    }
}