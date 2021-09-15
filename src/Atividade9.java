import javax.swing.*;
import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1, h2, r;
        System.out.println("Que horas a partida começou?");
        h1 = sc.nextInt();
        System.out.println("Que horas a partida terminou?");
        h2 = sc.nextInt();
        if (h1 < h2)
            r = h2 - h1;
        else r = 24 - h1 + h2;

        System.out.println("A partida durou: " + r + " horas.");
        sc.close();
    }
}
