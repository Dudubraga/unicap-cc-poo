package Aula05EstruturasDeRepeticao;
import java.util.Scanner;

public class questao07 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira um número invertido: ");
        String num = scan.nextLine();
        for(int i = num.length()-1; i >= 0; i--){
            System.out.print(num.charAt(i));
        }
        System.out.println();

        scan.close();
    }
}
