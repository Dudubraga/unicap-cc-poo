package Aula03ConceitosBasicos.Atividade03;
import java.util.Scanner;

public class questao28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira um número inteiro: ");
        int n = scan.nextInt();
        String str = "O dobro de " + Integer.toString(n) + " é " + Integer.toString(n*2);
        System.out.println(str);

        scan.close();
    }
}
