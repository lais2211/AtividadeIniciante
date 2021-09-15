import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha1;
        int senhac = 2211;
        System.out.println("Digite sua senha:");
        senha1 = sc.nextInt();
        while (senha1 != senhac) {
            System.out.println("Senha incorreta!");
            System.out.println("Digite sua senha:");
            senha1 = sc.nextInt();
        }

        System.out.println("Senha correta!");
        sc.close();
    }
}
