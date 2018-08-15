package Chapter3;

public class FlowerNumber {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int B = i / 100;
            int S = (i - B * 100) / 10;
            int G = i % 10;
            if (i == Math.pow(B, 3) + Math.pow(S, 3) + Math.pow(G, 3)) {
                System.out.println(i);
            }
        }

        FlowerNumber.Foeach();
    }

    public static void hcy(int... arg) {
        System.out.println(arg.toString());
    }

    public static void Foeach() {
        int[] arr = {1,2,3,1,2,2,1};
        for (int x: arr) {
            System.out.println(x);
        }

    }
}
