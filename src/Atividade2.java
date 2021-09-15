import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, resultado;
        System.out.println("Digite o primeiro numero:");
        A = sc.nextInt();
        System.out.println("Digite o segundo numero:");
        B = sc.nextInt();
        resultado = A + B;
        System.out.println("A soma dos dois valores é de: " + resultado);
        sc.close();


    }
}
