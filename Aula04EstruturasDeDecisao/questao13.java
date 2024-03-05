package Aula04EstruturasDeDecisao;
import java.util.Scanner;

public class questao13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira o dia da semana: ");
        String dia = scan.nextLine();
        if(dia.charAt(dia.length()-1) == 'o'){
            System.out.println("É um final de semana");
        }else{
            System.out.println("É um dia útil");
        }

        scan.close();
    }
}
