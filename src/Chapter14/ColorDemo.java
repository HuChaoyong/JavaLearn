package Chapter14;

public class ColorDemo {
    public static void main(String[] args) {
//        demo1();
        demo2();
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
    }
}

enum ColorEnum {
    RED, GREEN, BLUE;
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
