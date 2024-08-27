import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        double[] b = {1.57, 7.654, 9.986};
        int[] c = {128, 985, 155, 23, -500};

        // Задача 2
        for (int i = 0; i < a.length; i++) {
            if (i < a.length - 1) {
                System.out.print(a[i] + ", ");
            } else {
                System.out.print(a[2]);
            }
        }

        System.out.println();

        for (int о = 0; о < b.length; о++) {
            if (о < a.length - 1) {
                System.out.print(b[о] + ", ");
            } else {
                System.out.print(b[2]);
            }
        }

        System.out.println();

        for (int k = 0; k < c.length; k++) {
            if (k < c.length - 1) {
                System.out.print(c[k] + ", ");
            } else {
                System.out.print(c[4]);
            }
        }
        System.out.println();

        // Задача 3

        for (int i = a.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(a[i] + ", ");
            } else {
                System.out.print(a[0]);
            }
        }

        System.out.println();

        for (int j = b.length - 1; j >= 0; j--) {
            if (j > 0) {
                System.out.print(b[j] + ", ");
            } else {
                System.out.print(b[0]);
            }
        }

        System.out.println();

        for (int k = c.length - 1; k >= 0 ; k--) {
            if (k > 0) {
                System.out.print(c[k] +  ", ");
            } else {
                System.out.print(c[0]);
            }
        }

        System.out.println();

        // Задача 4
        for (int l = 0; l < a.length; l++) {
            if (a[l] % 2 == 1) {
                a[l] += 1;
            }
            System.out.print(a[l] + " ");
        }
        System.out.println();

    }
}