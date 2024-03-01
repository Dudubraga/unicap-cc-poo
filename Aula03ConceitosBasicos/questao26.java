package Aula03ConceitosBasicos;
import java.util.Scanner;

public class questao26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira um número inteiro e uma string: ");
        int n = scan.nextInt();
        //System.out.print("Insira uma string qualquer: ");
        String s = scan.next();
        String str = Integer.toString(n) + " " + s;
        System.out.println(str);

        scan.close();
    }
}
