import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int H, V, R;
        System.out.println("Qual o seu nome?");
        nome = sc.next();
        System.out.println(nome + " ,quantas horas você trabalhou hoje?");
        H = sc.nextInt();
        System.out.println(nome + " ,quanto você recebe por hora?");
        V = sc.nextInt();
        R = V * H;
        System.out.println(nome + " ,você irá receber pelo dia trabalhado o valor de: R$" + R);
        sc.close();
    }
}
