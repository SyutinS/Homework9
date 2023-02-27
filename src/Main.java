import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arrInteger = new int[3];
        arrInteger[0] = 1;
        arrInteger[1] = 2;
        arrInteger[2] = 3;
        System.out.println(Arrays.toString(arrInteger));
        double[] arrFraction = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(arrFraction));
        int[] arrMy = {31, 15, 54, 124, 0, 69};
        System.out.println(Arrays.toString(arrMy));
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arrInteger = new int[3];
        arrInteger[0] = 1;
        arrInteger[1] = 2;
        arrInteger[2] = 3;
        for (int i = 0; i < arrInteger.length; i++) {
            System.out.print(arrInteger[i]);
            if (i < arrInteger.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        double[] arrFraction = {1.57, 7.654, 9.986};
        for (int i = 0; i < arrFraction.length; i++) {
            System.out.print(arrFraction[i]);
            if (i < arrFraction.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        int[] arrMy = {31, 15, 54, 124, 0, 69};
        for (int i = 0; i < arrMy.length; i++) {
            System.out.print(arrMy[i]);
            if (i < arrMy.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arrInteger = new int[3];
        arrInteger[0] = 1;
        arrInteger[1] = 2;
        arrInteger[2] = 3;
        for (int i = arrInteger.length; i > 0; ) {
            i = i - 1;
            System.out.print(arrInteger[i]);
            if (i == 0) {
                System.out.println();
                break;
            } else {
                System.out.print(", ");
            }
        }
        double[] arrFraction = {1.57, 7.654, 9.986};
        int j = arrFraction.length;
        while (j > 0) {
            j = j - 1;
            System.out.print(arrFraction[j]);
            if (j == 0) {
                break;
            } else {
                System.out.print(", ");
            }
        }
        System.out.println();
        int[] arrMy = {31, 15, 54, 124, 0, 69};
        int k = arrMy.length;
        do {
            k = k - 1;
            System.out.print(arrMy[k]);
            if (k != 0) System.out.print(", ");
        }
        while (k > 0);
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] arrInteger = new int[3];
        arrInteger[0] = 1;
        arrInteger[1] = 2;
        arrInteger[2] = 3;
        System.out.println("Было " + Arrays.toString(arrInteger));
        for (int i = 0; i < arrInteger.length; i++) {
            if (arrInteger[i] % 2 != 0) {
                arrInteger[i] = arrInteger[i] + 1;
            }
        }
        System.out.println("Стало " + Arrays.toString(arrInteger));
    }
}