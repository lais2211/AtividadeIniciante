import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidade, codigo;


        System.out.println("Qual o codigo do seu pedido?");
        codigo = sc.nextInt();
        System.out.println("Quantos você pediu?");
        quantidade = sc.nextInt();
        double r;
        r = quantidade * codigo;
        if (codigo == 1) {
            r = quantidade * 4.50;
        } else if (codigo == 2) {
            r = quantidade * 3.50;
        } else if (codigo == 3) {
            r = quantidade * 2.50;
        } else if (codigo == 4) {
            r = quantidade * 2.00;
        } else {
            r = quantidade * 1.50;
        }

        System.out.println("O valor a ser pago na compra é de R$" + r);


        sc.close();
    }

}
