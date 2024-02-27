package Aula03ConceitosBasicos;
import java.util.Scanner;

public class questao1{

    public static void main(String[] args){
        System.out.print("Qual seu nome? ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Seja Bem Vindo, " + name + "!");
        scan.close();
    }
}
