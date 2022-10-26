public class Massive {
    public static void main(String[] args) {

        // Задание 1

        int[] arr = {0, 1, 0, 0, 0, 0, 1, 1, 1, 0};
        System.out.print("Задание 1 - ");
        for (int a = 0; a < arr.length; a++) {
            if (arr[a] > 0) {
                arr[a] = 0;
            } else arr[a] = 1;
            System.out.print(arr[a] + " ");
        }
        System.out.println();

        // Задание 2

        int[] chek = new int[8];
        System.out.print("Задание 2 - ");
        for (int b = 1; b < chek.length; b++) {
            chek[b] = b * 3;
            System.out.print(chek[b] + " ");
        }
        System.out.println();

        // Задание 3

        int[] multiplication = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("Задание 3 - ");
        for (int c = 0; c < multiplication.length; c++) {
            if (multiplication[c] < 6) {
                multiplication[c] = multiplication[c]*2;
           } else multiplication[c] = multiplication[c]*1;
            System.out.print(multiplication[c] + " ");
        }
        System.out.println();

        // Задание 4

        System.out.println("Задание 4 - ");
        int[][] square = new int[9][9];
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square.length; j++) {
                if (i == j || j == square.length - 1 - i) {
                    square[i][j] = 1;
                }
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
        //Задание 5

        int[] arc = {5, 23, 4, 56, 3, 7, -89, 101, 8};
        int min = arc[0];
        int max = arc[0];
        for (int i = 0; i < arc.length; i++) {
            if (arc[i] < min) {
                min = arc[i];
            }
            if (arc[i] > max) {
                max = arc[i];
            }
        }
        System.out.println("Максимальное значение= " + max);
        System.out.println("Минимальное значение= " + min);

        // Задание 6

        int[] mas = {2, 4, 6, 9, 1, 2};
        System.out.println("Задание 6 = " + chekBallans(mas));

        // Задание 7

        int[] revers = {1, 2, 3, 4, 5,6,7};
        print(revers);
        System.out.println();
        print(sdvig(revers, -9));

    }

    private static boolean chekBallans(int[] mas) {

        int leftSum, rightSum;

        for (int i = 0; i < mas.length; i++) {
            rightSum = 0;
            leftSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += mas[j];
            }
            for (int j = i; j < mas.length; j++) {
                rightSum += mas[j];
            }
            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }

    public static int[] sdvig(int[] revers, int n) {
        if (n % revers.length == 0) {
            return revers;
        }
        int shift;
        if (Math.abs(n) > revers.length) {
            shift = n % revers.length;
        } else {
            shift = n;
        }

        if (shift > 0) {
            for (int j = 0; j < shift; j++) {
                int tmp = revers[revers.length - 1];
                for (int i = 1; i < revers.length; i++) {
                    revers[revers.length - i] = revers[revers.length - i - 1];
                }
                revers[0] = tmp;
            }
        } else {
            for (int j = 0; j < Math.abs(shift); j++) {
                int tmp = revers[0];
                for (int i = revers.length; i > 1 ; i--) {
                    revers[revers.length - i] = revers[revers.length - i + 1];
                }
                revers[revers.length - 1] = tmp;
            }
        }


        return revers;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
