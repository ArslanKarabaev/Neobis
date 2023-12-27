import java.util.ArrayList;
import java.util.Scanner;

public class grenais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> g = new ArrayList<>();
        ArrayList<Integer> g1 = new ArrayList<>();
        int grenais;
        int vicInter = 0;
        int vicGremio = 0;
        int draw = 0;

        g.add(scanner.nextInt());
        g1.add(scanner.nextInt());
        System.out.println("Novo grenal (1-sim 2-nao)");
        int act = scanner.nextInt();

        while (act == 1) {
            g.add(scanner.nextInt());
            g1.add(scanner.nextInt());
            System.out.println("Novo grenal (1-sim 2-nao)");
            act = scanner.nextInt();
        }
        if (act == 2) {
            grenais = g.size();
            for (int i = 0; i < g.size(); i++) {
                if (g.get(i) > g1.get(i)) {
                    vicInter++;
                } else if (g.get(i) == g1.get(i)) {
                    draw++;
                } else{vicGremio++;}
            }
            System.out.println(grenais + " grenais" +
                    "\n" + "Inter:" + vicInter +
                    "\n" + "Gremio:" + vicGremio +
                    "\n" + "Empates:" + draw);
            if(vicInter > vicGremio){
                System.out.println("Inter venceu mais");
            }else if(vicInter < vicGremio){
                System.out.println("Gremio venceu mais");
            }else{System.out.println("Não houve vencedor");}
        }
    }
}