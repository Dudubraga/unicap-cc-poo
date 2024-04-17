package Aula03ConceitosBasicos.Atividade03;
import java.util.Scanner;

public class questao13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int num = scan.nextInt();
        if(num < 0){ System.out.println(num + " é um número negativo"); }
        else{ System.out.println(num + " é um numero positivo");}

        scan.close();
    }
}
