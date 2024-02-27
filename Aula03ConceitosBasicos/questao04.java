package Aula03ConceitosBasicos;
import java.util.Scanner;

public class questao04 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira 2 números inteiros: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int soma = a + b;
        System.out.println(a + " + " + b + " = " + soma);

        scan.close();
    }
}
