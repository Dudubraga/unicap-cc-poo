package Aula03ConceitosBasicos;
import java.util.Scanner;

public class questao17 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira seu Estado Civil: ");
        String estado = scan.nextLine();
        if(estado.charAt(estado.length()-1) == 'a'){
            System.out.println("Você é " + estado + "(o)");
        }else{
            System.out.println("Você é " + estado + "(a)");
        }

        scan.close();
    }
}
