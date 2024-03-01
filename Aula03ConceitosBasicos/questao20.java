package Aula03ConceitosBasicos;
import java.util.Scanner;

public class questao20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira 2 números decimais: ");
        float a = scan.nextFloat();
        float b = scan.nextFloat();
        System.out.println("O resto da divisão entre " + a + " e " + b + " é " + (a % b));

        scan.close();
    }
}
