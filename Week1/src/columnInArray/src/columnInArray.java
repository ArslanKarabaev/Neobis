package columnInArray.src;

import java.util.Scanner;

public class columnInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double[][] array = new Double[12][12];
        int column = scanner.nextInt();
        String act = scanner.next();
        double sum = 0.0, average;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                array[i][j] = scanner.nextDouble();
                // Math.round((Math.random() * 1000)) / 100d
                // можно использовать рандомайзер для проверки
            }
        }

        for (int j = 0; j < 12; j++) {
            sum += array[j][column];
        }
        if (act.equals("S")) {
            System.out.println(Math.round(sum * 10) / 10d);
        } else if (act.equals("M")) {
            average = sum / 12;
            System.out.println(Math.round(average * 10) / 10d);
        }
    }
}