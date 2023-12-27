package Banknotes;

import java.util.Scanner;

public class Banknotes {
    public static void main(String[] args) {
        // Task 1018 Banknotes.Banknotes
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int n,n1, n2, n3, n4, n5, n6, n7;
        n = N;
        n1 = N / 100;   N %= 100;
        n2 = N / 50;    N %= 50;
        n3 = N / 20;    N %= 20;
        n4 = N / 10;    N %= 10;
        n5 = N / 5;     N %= 5;
        n6 = N / 2;     N %= 2;
        n7 = N;

        System.out.println(n +
                "\n" + n1 + " nota(s) de R$ 100,00" +
                "\n" + n2 + " nota(s) de R$ 50,00" +
                "\n" + n3 + " nota(s) de R$ 20,00" +
                "\n" + n4 + " nota(s) de R$ 10,00" +
                "\n" + n5 + " nota(s) de R$ 5,00" +
                "\n" + n6 + " nota(s) de R$ 2,00" +
                "\n" + n7 + " nota(s) de R$ 1,00");

    }
}