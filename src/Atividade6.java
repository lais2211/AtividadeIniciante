import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor;
        System.out.println("Digite um valor:");
        valor = sc.nextDouble();
        if (valor < 0)
            System.out.println(valor + " é um numero negativo!");
        else
            System.out.println(valor + " é um numero positivo!");
        sc.close();
    }
}
