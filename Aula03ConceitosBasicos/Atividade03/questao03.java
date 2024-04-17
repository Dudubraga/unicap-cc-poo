package Aula03ConceitosBasicos.Atividade03;
import java.util.Scanner;

public class questao03 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira um número inteiro: ");
        int a = scan.nextInt();
        float b = (float) a;
        System.out.println("O número é: " + b);
        
        scan.close();
    }
}
