package Chapter12;

import java.io.*;

/**
 * 序列化的demo
 * 对象序列化就是把一个对象转换成二进制的数据流
 *
 * 转换成二进制流以后，可以更方便的传输
 */

public class SerializableDemo {
    public static void main(String[] args) {
//        saveSerializable();
        readSerializable();
    }

    /**
     * 保存序列化到文件
     */
    public static void saveSerializable() {
        File f = new File("/home/hcy/temp/serializable.txt");
        ObjectOutputStream oos = null;

        OutputStream out = null;
        try {
            out = new FileOutputStream(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            oos = new ObjectOutputStream(out);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            oos.writeObject(new Person("张三", 25));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 读取序列化的值
     */
    public static void readSerializable() {
        File f = new File("/home/hcy/temp/serializable.txt");
        ObjectInputStream ois = null;
        InputStream input = null;
        try {
            input = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            ois = new ObjectInputStream(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Object obj = null;
        try {
             obj = ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(obj);

    }


}

class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name =name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
