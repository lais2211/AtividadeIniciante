import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario, imposto, resultado;

        System.out.println("Digite aqui seu salario: R$");
        salario = sc.nextDouble();

        resultado = salario / 100;

        if (salario <= 2000) {
            System.out.println("Você não precisa pagar impostos!");
        } else if (salario == 2000.01 || salario <= 3000.00) {
            imposto = resultado * 8;
            System.out.println("O valor do seu imposto a ser pago será de: R$" + imposto);
        } else if (salario == 3000.01 || salario <= 4500.00) {
            imposto = resultado * 18;
            System.out.println("O valor do seu imposto a ser pago será de: R$" + imposto);
        } else if (salario >= 4500.01) {
            imposto = resultado * 28;
            System.out.println("O valor do seu imposto a ser pago será de: R$" + imposto);
        } else {
            System.out.println("Valor inconclusivo!");
        }

        sc.close();
    }

}
