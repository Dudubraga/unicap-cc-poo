package Aula05EstruturasDeRepeticao;
import java.util.Scanner;

public class questao02 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira um número inteiro: ");
        int n = scan.nextInt();
        String num = Integer.toString(n);
        int sum = 0;
        for(int i = 0; i < num.length(); i++){
            sum += num.charAt(i) - '0';
        }
        System.out.println(sum + " é a soma dos dígitos de " + n);

        scan.close();
    }
}
