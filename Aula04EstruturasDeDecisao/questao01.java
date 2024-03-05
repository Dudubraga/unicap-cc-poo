package Aula04EstruturasDeDecisao;
import java.util.Scanner;

public class questao01 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira um número inteiro:");
        int n = scan.nextInt();
        if(n < 0){ System.out.println("O número é negativo"); }
        else if(n == 0){ System.out.println("O número é 0"); }
        else if(n > 0){ System.out.println("O número é positivo"); }

        scan.close();
    }
}
