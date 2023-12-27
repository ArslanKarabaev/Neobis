import java.util.Scanner;

public class weightedAverages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float sum = 0.0f;
        Float[][] array = new Float[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = scanner.nextFloat() ;
                //(float) Math.round((Math.random() * 1000)) / 100f
                // можно использовать рандомайзер для проверки
            }
        }
        for (int i = 0; i < n; i++) {
                sum = array[i][0] * 2 + array[i][1] * 3 + array[i][2] * 5 ;
            System.out.println((float) Math.round(sum)/10f);
            sum = 0.0f;
        }

    }
}