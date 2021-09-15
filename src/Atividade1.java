import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C, D;
        System.out.println("Digite o valor de A:");
        A = sc.nextInt();
        System.out.println("Digite o valor de B:");
        B = sc.nextInt();
        System.out.println("Digite o valor de C:");
        C = sc.nextInt();
        System.out.println("Digite o valor de D:");
        D = sc.nextInt();
        int resultado1 = A * B;
        int resultado2 = C * D;
        int resultado3 = A * B - C * D;
        System.out.println("A soma de A + B é: " + resultado1);
        System.out.println("A soma de C + D é: " + resultado2);
        System.out.println("A diferença entre elas é de " + resultado3);


        sc.close();


    }
}
