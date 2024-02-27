package Aula03ConceitosBasicos;
import java.util.Scanner;

public class questao08 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira vários números separados por espaço: ");
        String input = scan.nextLine();
        String[] numeros = input.split(" ");
        int qntNumeros = numeros.length;
        System.out.println(qntNumeros + " foram digitados");

        scan.close();
    }
}
