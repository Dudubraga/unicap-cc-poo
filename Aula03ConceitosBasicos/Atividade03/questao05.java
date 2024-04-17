package Aula03ConceitosBasicos.Atividade03;
import java.util.Scanner;

public class questao05 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira um número decimal: ");
        float n = scan.nextFloat();
        System.out.println("O quadrado de " + n + " é " + n*n);

        scan.close();
    }    
}
