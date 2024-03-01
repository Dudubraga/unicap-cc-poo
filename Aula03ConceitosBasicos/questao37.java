package Aula03ConceitosBasicos;
import java.util.Scanner;

public class questao37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira um número decimal: ");
        float n = scan.nextFloat();
        System.out.println(Math.round(n) + " é o inteiro mais próximo de " + n);

        scan.close();
    }
}
