package Aula03ConceitosBasicos.Atividade03;
import java.util.Scanner;

public class questao30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira dois números inteiros: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int soma = a + b;
        int sub = a - b;
        int prod = a * b;
        int quo = a / b;
        System.out.println(a + " + " + b + " = " + soma);
        System.out.println(a + " - " + b + " = " + sub);
        System.out.println(a + " * " + b + " = " + prod);
        System.out.println(a + " / " + b + " = " + quo);

        scan.close();
    }
}
