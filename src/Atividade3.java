import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Pi = 3.14159;
        System.out.println("Digite o valor do raio:");
        double raio = sc.nextDouble();
        double resultado = Pi * (Math.pow(raio, 2));
        System.out.println("A area do circulo será de: " + resultado);
        sc.close();
    }
}
