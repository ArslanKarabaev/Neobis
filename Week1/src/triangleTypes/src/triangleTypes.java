package triangleTypes.src;

import java.util.ArrayList;
import java.util.Scanner;

public class triangleTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> corners = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            corners.add(i, scanner.nextDouble());
        }
        Double A = corners.get(0), B = corners.get(1), C = corners.get(2), n;
        for (int i = 0; i < 3; i++) {
            if (B > A) {
                n = A;
                A = B;
                B = n;
            } else if (C > B) {
                n = B;
                B = C;
                C = n;
            }
        }

        if (A >= B + C) System.out.println("NAO FORMA TRIANGULO");
        if (A * A == B * B + C * C) System.out.println("TRIANGULO RETANGULO");
        if (A * A > B * B + C * C) System.out.println("TRIANGULO OBTUSANGULO");
        if (A * A < B * B + C * C) System.out.println("TRIANGULO ACUTANGULO");
        if (A.equals(B) && B.equals(C)) System.out.println("TRIANGULO EQUILATERO");
        if (A.equals(B) || B.equals(C) || A.equals(C)) System.out.println("TRIANGULO ISOSCELES");
    }
}