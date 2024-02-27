package Aula03ConceitosBasicos;
import java.util.Scanner;

public class questao01 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira o seu nome: ");
        String nome = scan.nextLine();
        System.out.println("Seja Bem Vindo, " + nome + "!");
        
        scan.close();
    }
}
