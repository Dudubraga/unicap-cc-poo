package Aula04EstruturasDeDecisao;
import java.util.Scanner;

public class questao04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int n = scan.nextInt();
        if(n % 2 == 0){ System.out.println("O número é par"); }
        else{ System.out.println("O número é ímpar"); }

        scan.close();
    }
}
