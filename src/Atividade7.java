import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor;
        System.out.println("Digite o valor:");
        valor = sc.nextDouble();
        if (valor % 2 == 0)
            System.out.println("Seu valor é par.");
        else
            System.out.println("Seu valor é impar.");
        sc.close();
    }
}
