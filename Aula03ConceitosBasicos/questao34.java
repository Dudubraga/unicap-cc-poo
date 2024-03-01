package Aula03ConceitosBasicos;
import java.util.Scanner;

public class questao34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira três números decimais: ");
        float a = scan.nextFloat();
        float b = scan.nextFloat();
        float c = scan.nextFloat();
        float media = (a + b + c) / 3;
        System.out.println("A média entre os números inseridos é " + media);

        scan.close();
    }
}
