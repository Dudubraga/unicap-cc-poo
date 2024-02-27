package Aula03ConceitosBasicos;
import java.util.Scanner;

public class questao06 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira o seu ano de nascimento: ");
        int ano = scan.nextInt();
        int idade = 2024 - ano;
        System.out.println("Você tem " + idade + " anos");

        scan.close();
    }
}