package Aula03ConceitosBasicos;
import java.util.Scanner;

public class questao18 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira a base a altura de um retângulo: ");
        int base = scan.nextInt();
        int altura = scan.nextInt();
        System.out.println("O retângulo possui uma área de " + (base * altura) + " cm²");

        scan.close();
    }
}
