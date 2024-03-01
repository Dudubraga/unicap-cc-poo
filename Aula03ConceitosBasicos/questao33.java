package Aula03ConceitosBasicos;
import java.util.Scanner;

public class questao33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira a base e a altura de um retângulo: ");
        float base = scan.nextFloat();
        float altura = scan.nextFloat();
        float area = base * altura;
        System.out.println("A área do retângulo é de " + area + "cm²");

        scan.close();
    }
}
