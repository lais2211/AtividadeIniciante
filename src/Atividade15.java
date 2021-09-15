import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para soma, quando quiser que a soma acabe digite 0:");
        x = sc.nextInt();
        int soma = 0;
        while (x != 0) {
            System.out.println("Digite um numero para soma, quando quiser que a soma acabe digite 0:");
            soma += x;
            x = sc.nextInt();
        }
        System.out.println("O resultado da sua soma foi de: " + soma);
        sc.close();
    }
}
