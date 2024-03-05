package Aula04EstruturasDeDecisao;
import java.util.Scanner;

public class questao06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira o nome da primeira pessoa: ");
        String p1 = scan.nextLine();
        System.out.print("Insira o nome da segunda pessoa: ");
        String p2 = scan.nextLine();
        if(p1.length() > p2.length()){
            System.out.println("A primeira pessoa possui o maior nome");
        }
        else if(p1.length() < p2.length()){
            System.out.println("A segunda pessoa possui o maior nome");
        }else{
            System.out.println("As duas possuem nomes de mesmo tamanho");
        }

        scan.close();
    }
}
