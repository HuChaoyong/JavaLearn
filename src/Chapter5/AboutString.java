package Chapter5;


/**
 * 有关于 String的东西
 *
 * 1. 每个直接赋值的 String 都是要开辟一个堆空间,
 *  如果, 某个字符串已经有赋值, 比如  String a = "hcy"
 *  那么,后面赋值的字符对象 "hcy" 就不会去开辟新的空间,
 *  所有  String a = "hcy";  String b = "hcy";  a == b ?  => true
 *
 *  2. 但凡用  New String(original); 创建的字符对象,都是去堆内存里面开辟的新的内存地址,
 *  所依,用  == 判断时,会是false,  因为  == 是用来比较数值的, 地址不一样,数值也就不一样.
 *  所以,为了单纯的判断字符想不想等,必须用  String.equals(str);
 *
 *  3. 每个单独的  字符串, 都是 String 构造的匿名对象. 因为它是含有string类的方法的,(这很容易验证)
 *
 *  4. String  匿名实例使用的是共享设计, 即, 在Java中形成一个对象池,在这个对象池中保留多个对象,新实例如果在
 *  对象池中有的话,就直接从对象池里面取出,而不是新建. 如果是通过new 创建的就不会使用共享池的设计
 *
 *
 *
 */

public class AboutString {
    public static void main(String[] args) {
        String name = "hcy";
        String nb = "hcy";
        String na = new String("hcy");
        String nc = new String("hcy");
        System.out.println(name);
        System.out.println(na);

        int a = 10;
        int b = 10;
        System.out.println(a == b);

        String sa = "str";
        String sb  ="str";
        System.out.println(nb.equals(na));
    }
}
