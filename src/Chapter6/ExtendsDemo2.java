package Chapter6;

import java.util.Arrays;

// 基础 Array类

class Array {
    private int temp[];
    private int foot;
    public Array(int len) {
        if (len > 0) {
            this.temp = new int[len];
        } else {
            this.temp = new int[1];
        }
    }

    public boolean add(int i ) {
        if (this.foot < this.temp.length) {
            this.temp[this.foot] = i;
            this.foot ++;
            return true;
        } else {
            return false;
        }
    }

    public int[] getArray() {
        return this.temp;
    }
}

// 反转数组类

class MyReverseArray extends Array {

    public MyReverseArray (int len) {
        super(len);
    }

    public int[] getArray() {
        int[] arr = super.getArray();
        int[] brr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            brr[arr.length - 1 - i] = arr[i];
        }
        return brr;
    }
}

class MySortArray extends Array {
    public MySortArray(int len) {
        super(len);
    }

    public int[] getArray() {
        int[] arr = super.getArray();
        Arrays.sort(arr);
        return arr;
    }
}

class ReverseArray extends Array {
    public ReverseArray(int len) {
        super(len);
    }

    public int[] getArray() {
        int[] t = new int[super.getArray().length];
        int count = t.length - 1;
        for (int i = 0; i < t.length; i++) {
            t[count] = super.getArray()[i];
            count --;
        }
        return t;
    }
}

public class ExtendsDemo2 {
    public static void main(String[] args) {
        MyReverseArray a = new MyReverseArray(5);
        System.out.print(a.add(23) + "\t");
        System.out.print(a.add(21) + "\t");
        System.out.print(a.add(2) + "\t");
        System.out.print(a.add(42) + "\t");
        System.out.print(a.add(5) + "\t");
        System.out.print(a.add(6) + "\n");
        ExtendsDemo2.print(a.getArray());

        System.out.println();

        MySortArray s = new MySortArray(5);
        System.out.print(s.add(23) + "\t");
        System.out.print(s.add(21) + "\t");
        System.out.print(s.add(2) + "\t");
        System.out.print(s.add(42) + "\t");
        System.out.print(s.add(5) + "\t");
        System.out.print(s.add(6) + "\t");
        System.out.println();
        print(s.getArray());
    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + "、");
        }
    }
}
