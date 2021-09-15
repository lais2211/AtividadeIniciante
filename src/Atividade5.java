import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double codigo, codigo2, n1, n2, v1, v2, resultado, resultado2, total;
        System.out.println("Qual o codigo da peça 1?");
        codigo = sc.nextDouble();
        System.out.println("Quantas peças?");
        n1 = sc.nextDouble();
        System.out.println("Qual o valor unitario de cada peça?");
        v1 = sc.nextDouble();
        System.out.println("Qual o codigo da peça 2?");
        codigo2 = sc.nextDouble();
        System.out.println("Quantas peças?");
        n2 = sc.nextDouble();
        System.out.println("Qual o valor unitario de cada peça?");
        v2 = sc.nextDouble();
        resultado = n1 * v1;
        resultado2 = n2 * v2;
        total = resultado + resultado2;
        System.out.println("O valor total a ser pago nas duas peças é de: R$" + total);
        sc.close();
    }
}
