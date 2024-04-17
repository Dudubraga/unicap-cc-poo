package Aula03ConceitosBasicos.Atividade03;
import java.util.Scanner;

public class questao25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira seu ano de nascimento: ");
        String ano = scan.nextLine();
        System.out.println("Bem-vindo ao nosso programa, nascido em " + ano);

        scan.close();
    }
}
