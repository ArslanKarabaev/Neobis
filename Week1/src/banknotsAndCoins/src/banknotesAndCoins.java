import java.util.Scanner;

public class banknotesAndCoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float N = scanner.nextFloat();
        int n1, n2, n3, n4, n5, n6, N1 = 0, N2, N3, N4, N5;
        float N6;
        n1 = (int) (N / 100);
        N %= 100;
        n2 = (int) (N / 50);
        N %= 50;
        n3 = (int) (N / 20);
        N %= 20;
        n4 = (int) (N / 10);
        N %= 10;
        n5 = (int) (N / 5);
        N %= 5;
        n6 = (int) (N / 2);
        N %= 2;

        if (N - 1 >= 0) {
            N1++;
            N--;
        }
        N2 = (int) (N / 0.5);
        N %= 0.5;
        N3 = (int) (N / 0.25);
        N %= 0.25;
        N4 = (int) (N / 0.1);
        N %= 0.1;
        N5 = (int) (N / 0.05);
        N %= 0.05;
        N = Math.round(N * 100.0) / 100.0f;
        N6 = (float) (N / 0.01);

        System.out.println("NOTAS:" +
                "\n" + n1 + " nota(s) de R$ 100.00" +
                "\n" + n2 + " nota(s) de R$ 50.00" +
                "\n" + n3 + " nota(s) de R$ 20.00" +
                "\n" + n4 + " nota(s) de R$ 10.00" +
                "\n" + n5 + " nota(s) de R$ 5.00" +
                "\n" + n6 + " nota(s) de R$ 2.00" +
                "\n" + "MOEDAS:" +
                "\n" + N1 + " moeda(s) de R$ 1.00" +
                "\n" + N2 + " moeda(s) de R$ 0.50" +
                "\n" + N3 + " moeda(s) de R$ 0.25" +
                "\n" + N4 + " moeda(s) de R$ 0.10" +
                "\n" + N5 + " moeda(s) de R$ 0.05" +
                "\n" + (int)N6 + " moeda(s) de R$ 0.01"
        );
    }
}