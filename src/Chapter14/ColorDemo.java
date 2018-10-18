package Chapter14;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;

public class ColorDemo {
    public static void main(String[] args) {
//        demo1();
//        demo2();
//        demo3(ColorEnum.RED);
//        demo4();
//        demo5();
        demo6();
    }

    public static void demo1() {
        Color c1 = Color.RED;
        Color c2 = Color.getInstance(3);

        System.out.println(c1.getName());
        System.out.println(c2.getName());
    }

    public static void demo2() {
        ColorEnum c = ColorEnum.BLUE;

        System.out.println(c);

        for  (ColorEnum item: ColorEnum.values()) {
            System.out.println(item);
        }
    }

    public static void demo3(ColorEnum color) {
        switch (color) {
            case RED:
                System.out.println("红色");
                break;
            case GREEN:
                System.out.println("绿色");
                break;
            case BLUE:
                System.out.println("蓝色");
                break;
            default:
                System.out.println("未知颜色");
        }
    }

    public static void demo4() {
        System.out.println(Color2.RED.getName());
        for (Color2 c: Color2.values()) {
            System.out.println(c.ordinal() + "--->" + c.name() + "(" + c.getName() + ")");
        }
    }

    public static void demo5() {
        Map<ColorEnum, String> desc = null;

        desc = new EnumMap<ColorEnum, String>(ColorEnum.class);
        desc.put(ColorEnum.RED, "红色");
        desc.put(ColorEnum.GREEN, "绿色");
        desc.put(ColorEnum.BLUE, "蓝色");

        for (ColorEnum c: desc.keySet()) {
            System.out.println("key:" + c);
        }

        for (String v: desc.values()) {
            System.out.println("value:" + v);
        }
    }

    public static void demo6() {
        EnumSet<ColorEnum> es = null;
        es = EnumSet.allOf(ColorEnum.class);

        for (ColorEnum c: es) {
            System.out.print(c + "、");
        }
        System.out.println();
    }
}

enum ColorEnum {
    RED, GREEN, BLUE;
}

enum Color2 {
    RED("红色"), GREEN("绿色"), BLUE("蓝色");

    private String name;
    private Color2(String name) {
        this.setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}

// 手动实现枚举
class Color {
    public static final Color RED = new Color("红色");
    public static final Color GREEN = new Color("绿色");
    public static final Color BLUE = new Color("蓝色");

    private String name;

    public Color(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Color getInstance(int i) {
        switch (i) {
            case 1: {
                return RED;
            }
            case 2: {
                return GREEN;
            }
            case 3: {
                return BLUE;
            }
            default: {
                return null;
            }
        }
    }
}
