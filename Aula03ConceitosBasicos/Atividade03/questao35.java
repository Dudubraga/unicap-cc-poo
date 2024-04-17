package Aula03ConceitosBasicos.Atividade03;
import java.util.Scanner;

public class questao35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira sua idade: ");
        int idade = scan.nextInt();
        int meses = idade * 12;
        int dias = idade * 365;
        System.out.println("Você já viveu aprox. " + meses + " meses ou " + dias + " dias" );

        scan.close();
    }
}
