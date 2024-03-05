package Aula04EstruturasDeDecisao;
import java.util.Scanner;

public class questao16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira a idade: ");
        int idade = scan.nextInt();
        if(idade >= 0 && idade <= 1){
            System.out.println("É um bebê");
        }
        else if(idade > 1 && idade <= 12){
            System.out.println("É uma criança");
        }
        else if(idade > 12 && idade <= 18){
            System.out.println("É um adolescente");
        }else{
            System.out.println("É um adulto");
        }

        scan.close();
    }
}
