public class sequenceIJ4 {
    public static void main(String[] args) {
        float I = 0, J = 1;
        while (I <= 2) {
            for (int i = 0; i < 3; i++) {
                if (I == 0 || I == 1 || I == 2) System.out.println("I=" + (int) I + " J=" + (int) (J + I + i));
                else System.out.println("I=" + I + " J=" + (J + I + i));
            }
            I += 0.2;
            I = Math.round(I * 10) / 10f;
        }
    }
}