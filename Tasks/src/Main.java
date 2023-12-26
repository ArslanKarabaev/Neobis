import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Task 1018 Banknotes
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int n1, n2, n3, n4, n5, n6, n7;
        n1 = N / 100;  N %= 100;
        n2 = N / 50;   N %= 50;
        n3 = N / 20;   N %= 20;
        n4 = N / 10;   N %= 10;
        n5 = N / 5;    N %= 5;
        n6 = N / 2;    N %= 2;
        n7 = N;

        System.out.println(n1 + "\n" + n2 + "\n" + n3 + "\n" + n4 + "\n" + n5 + "\n" + n6 + "\n" + n7);

    }
}