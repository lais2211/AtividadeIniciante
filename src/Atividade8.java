import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B;
        System.out.println("Digite o primeiro valor:");
        A = sc.nextInt();
        System.out.println("Digite o segundo valor:");
        B = sc.nextInt();
        if (A % B == 0 || B % A == 0)
            System.out.println("Seus valores são multiplos!");
        else
            System.out.println("Seus valores não são multiplos!");
        sc.close();
    }
}
