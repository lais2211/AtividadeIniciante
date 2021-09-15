import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, X, Y;
        int D = 0;
        int F = 0;
        System.out.println("Digite a quantidade de valores para o sistema ler em seguida:");
        N = sc.nextInt();
        for (X = 0; X < N; X = X + 1) {
            System.out.println("Agora digite seu valor:");
            Y = sc.nextInt();
            if (Y >= 10 && Y <= 20) {
                D = D + 1;
            } else {
                F = F + 1;
            }
        }
        System.out.println("Seus valores digitados se encontram entre a media de 10 e 20: " + D + " dentro.");
        System.out.println(F + " fora.");
        sc.close();
    }
}
