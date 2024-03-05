package Aula04EstruturasDeDecisao;
import java.util.Scanner;

public class questao07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira um caractere: ");
        char c = scan.next().charAt(0);
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            System.out.println("É uma vogal");
        }else{
            System.out.println("É uma consoante");
        }

        scan.close();
    }
}
