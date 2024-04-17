package Aula03ConceitosBasicos.Atividade03;
import java.util.Scanner;

public class questao21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira um número decimal: ");
        float f = scan.nextFloat();
        int n = (int) f;
        System.out.println(n + " é o número convertido em inteiro");

        scan.close();
    }
}
