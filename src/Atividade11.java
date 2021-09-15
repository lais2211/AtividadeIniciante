import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double codigo;
        System.out.println("Digite o seu valor numerico:");
        codigo = sc.nextDouble();
        if (codigo <= 25) {
            System.out.println("Intervalo (0,25)");
        } else if (codigo == 26 || codigo <= 50) {
            System.out.println("Intervalo (25,50)");
        } else if (codigo == 51 || codigo <= 75) {
            System.out.println("Intervalo (50,75)");
        } else if (codigo == 76 || codigo <= 100) {
            System.out.println("Intervalo (75,100)");
        } else {
            System.out.println("Fora do intervalo programado!");
        }
    }
}
