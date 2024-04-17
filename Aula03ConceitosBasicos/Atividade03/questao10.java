package Aula03ConceitosBasicos.Atividade03;
import java.util.Scanner;

public class questao10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira seu nome: ");
        String nome = scan.nextLine();
        System.out.print("Insira seu sobrenome: ");
        String sobrenome = scan.nextLine();
        System.out.println(sobrenome + ", " + nome);

        scan.close();
    }
}
