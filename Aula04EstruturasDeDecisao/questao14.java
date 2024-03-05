package Aula04EstruturasDeDecisao;
import java.util.Scanner;

public class questao14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira um número de 1 a 5: ");
        int n = scan.nextInt();
        switch(n){
            case 1:
                System.out.println("Muito insuficiente");
                break;
            case 2:
                System.out.println("Insuficiente");
                break;
            case 3:
                System.out.println("Regular");
                break;
            case 4:
                System.out.println("Bom");
                break;
            case 5:
                System.out.println("Muito bom");
                break;
        }

        scan.close();
    }
}
