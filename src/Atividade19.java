import java.util.Scanner;

public class Atividade19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.println("Digite um numero e diremos seus divisores:");
        N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }

}
