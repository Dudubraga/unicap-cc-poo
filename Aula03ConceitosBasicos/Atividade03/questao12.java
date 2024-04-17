package Aula03ConceitosBasicos.Atividade03;
import java.util.Scanner;

public class questao12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int num = scan.nextInt();
        if(num % 2 == 0){ System.out.println(num + " é um número par"); }
        else{ System.out.println(num + " é um número ímpar"); }

        scan.close();
    }

}
