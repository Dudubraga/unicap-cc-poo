package Aula04EstruturasDeDecisao;
import java.util.Scanner;

public class questao02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira sua idade: ");
        int idade = scan.nextInt();
        if(idade >= 18){ System.out.println("Maior de idade");}
        else{ System.out.println("Menor de idade"); }

        scan.close();
    }
}
