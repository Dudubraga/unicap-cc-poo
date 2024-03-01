package Aula03ConceitosBasicos;
import java.util.Scanner;

public class questao31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira a base e a altura de um triângulo: ");
        float a = scan.nextFloat();
        float b = scan.nextFloat();
        float area = (a + b) / 2;
        System.out.println("A área do triângulo é de " + area + " cm²");

        scan.close();
    }
}
