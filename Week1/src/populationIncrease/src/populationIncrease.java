import java.util.Scanner;

public class populationIncrease {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int counter = 0;
            int PA = scanner.nextInt();
            int PB = scanner.nextInt();
            float G1 = scanner.nextFloat();
            float G2 = scanner.nextFloat();
            while (PA <= PB) {
                PA = (int) ((int) Math.floor(PA) * (1 + (G1 / 100)));
                counter++;
                PB = (int) ((int) Math.floor(PB) * (1 + (G2 / 100)));
            }
            if(counter > 100) System.out.println("Mais de 1 seculo.");
            else System.out.println(counter + " anos.");
        }
    }
}