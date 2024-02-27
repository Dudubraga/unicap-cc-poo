package Aula03ConceitosBasicos;
import java.util.Scanner;

public class questao07 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira seu nome: ");
        String nome = scan.nextLine();
        System.out.print("Insira seu sobrenome: ");
        String sobrenome = scan.nextLine();
        String completo = nome + " " + sobrenome;
        System.out.println("Seu nome completo é: " + completo);

        scan.close();
    }
}
