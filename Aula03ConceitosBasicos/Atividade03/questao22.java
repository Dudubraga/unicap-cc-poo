package Aula03ConceitosBasicos.Atividade03;
import java.util.Scanner;

public class questao22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira um número inteiro: ");
        String num = scan.nextLine();
        int n = Integer.parseInt(num) + 10;
        String soma = Integer.toString(n);
        System.out.println(num + " + 10 = " + soma);

        scan.close();
    }
}
