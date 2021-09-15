import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int consumo, valor, valor2;
        System.out.println("Quantos minutos você passou ao telefone esse mês?");
        consumo = sc.nextInt();
        valor = consumo - 100;
        valor2 = valor * 2 + 50;
        if (consumo <= 100)
            System.out.println("O valor a ser pago será de 50 reais!");
        else
            System.out.println("O valor a ser pago será de " + valor2 + " reais!");

    }
}
