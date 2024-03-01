package Aula03ConceitosBasicos;
import java.util.Scanner;

public class questao29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira seu e-mail: ");
        String email = scan.nextLine();
        System.out.println("Obrigado " + email);

        scan.close();
    }
}
