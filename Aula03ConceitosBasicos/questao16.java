package Aula03ConceitosBasicos;
import java.util.Scanner;

public class questao16 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira seu nome: ");
        String nome = scan.nextLine();
        if(nome.length() > 5){ System.out.println("Seu nome possui mais de 5 caracteres");}
        else{ System.out.println("Seu nome não possui mais de 5 caracteres"); }
        
        scan.close();
    }
}
