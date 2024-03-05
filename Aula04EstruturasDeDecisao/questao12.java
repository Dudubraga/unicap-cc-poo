package Aula04EstruturasDeDecisao;
import java.util.Scanner;

public class questao12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira um número inteiro: ");
        int n = scan.nextInt();
        if(n % 3 == 0 && n % 5 == 0){
            System.out.println("O número é divisível por 3 e por 5");
        }else{
            System.out.println("O número não é divisível por 3 ou por 5");
        }

        scan.close();
    }
}
