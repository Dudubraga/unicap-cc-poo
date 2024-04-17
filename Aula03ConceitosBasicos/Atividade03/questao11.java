package Aula03ConceitosBasicos.Atividade03;
import java.util.Scanner;

public class questao11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira uma string qualquer: ");
        String str = scan.nextLine();
        int tam = str.length();
        System.out.println("A string inserida possui " + tam + " caracteres");

        scan.close();
    }
}
