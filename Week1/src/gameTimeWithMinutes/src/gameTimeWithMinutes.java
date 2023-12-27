import java.util.Scanner;

public class gameTimeWithMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int before, after, h, h1, m, m1;
        h = scanner.nextInt();
        m = scanner.nextInt();
        h1 = scanner.nextInt();
        m1 = scanner.nextInt();
        before = h * 60 + m;
        after = h1 * 60 + m1;
        if(after > before){
            m = Math.abs(after - before);
            h = m / 60;
            m %= 60;
        } else if (after == before) {
            h = 24;
            m = 0;
        } else {
            m =Math.abs(before - (after + 1440));
            h = m / 60;
            m %= 60;
        }
        System.out.println("O JOGO DUROU " + h + " HORA(S) E " + m + " MINUTO(S)");
    }
}