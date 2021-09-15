import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data;
        System.out.println("Digite um numero de 1 a 7 para equivaler a uma data (Domingo a sabado em ordem):");
        data = sc.nextInt();
        String dia;

        switch (data) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sabado";
                break;
            default:
                dia = "Invalido!";
        }
        System.out.println("O dia de hoje é: " + dia);
        sc.close();
    }
}
