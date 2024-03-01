package Aula03ConceitosBasicos;
import java.util.Scanner;

public class questao19 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira sua cidade: ");
        String cidade = scan.nextLine();
        if(cidade.charAt(0) == 'S' || cidade.charAt(0) == 's'){
            System.out.println("Sua cidade começa com a letra S");
        }else{
            System.out.println("Sua cidade não começa com a letra S");
        }

        scan.close();
    }
}
