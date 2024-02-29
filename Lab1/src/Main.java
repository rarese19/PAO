import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static int factorial(int n) {
        if (n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.printf("Al carui numar doriti facotrialu? ");
        Scanner input = new Scanner(System.in);
        int numar = input.nextInt();
        System.out.printf(factorial(numar) + "\n");

    }
}

class EnhancedFor {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3}, {4,5,6}, {7}};
        for (int[] linie : a) {
            for (int elem : linie) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }

        System.out.printf(Arrays.deepToString(a));
    }
}