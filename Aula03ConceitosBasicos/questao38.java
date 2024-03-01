package Aula03ConceitosBasicos;
import java.util.Scanner;

public class questao38 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira três números inteiros: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int r = (a + b) * c;
        System.out.println("("+ a +" + "+ b +") * "+ c +" = "+ r);

        scan.close();
    }
}
