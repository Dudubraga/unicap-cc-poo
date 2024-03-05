package Aula04EstruturasDeDecisao;
import java.util.Scanner;

public class questao03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira dois números inteiros: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(a > b){ System.out.println(a + " é maior"); }
        if(a < b){ System.out.println(b + " é maior"); }

        scan.close();
    }
}
