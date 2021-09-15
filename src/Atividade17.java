import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int tipo;
        System.out.println("Bem vindo ao posto Nova Cidade! Gostariamos de saber qual combustivel vocês andam usando mais ultimamente! Digite: ");
        System.out.println("1 - Alcool; 2 - Gasolina; 3- Diesel; 4 - Fim da pesquisa ");
        tipo = sc.nextInt();
        while (tipo != 4) {
            if (tipo == 1) {
                alcool = alcool + 1;
                System.out.println("Continuem votando!");
            } else if (tipo == 2) {
                gasolina = gasolina + 1;
                System.out.println("Continuem votando!");
            } else if (tipo == 3) {
                diesel = diesel + 1;
                System.out.println("Continuem votando!");
            } else
                System.out.println("Codigo invalido!");
            tipo = sc.nextInt();
        }
        System.out.println("Muito obrigado! O resultado foi de: ");
        System.out.println("Alcool : " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
