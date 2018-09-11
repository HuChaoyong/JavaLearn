package Chapter11;

// 数组介绍

// equals(int[] a, int[] b) 判断两个数组是否相等
// fill(int[] a, int val]； 将val填充到a数组中


import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] temp = {3, 5, 7, 9, 1, 2, 6, 8};
        Arrays.sort(temp);
        System.out.println("排序后的数组:");
        System.out.println(Arrays.toString(temp));

        int point = Arrays.binarySearch(temp, 3);
        System.out.println("元素‘3’的位置在： " + point);
        Arrays.fill(temp, 2333);
        System.out.println("数组填充： ");
        System.out.println(Arrays.toString(temp));
    }
}
