package Aula05EstruturasDeRepeticao;
import java.util.Scanner;

public class questao06 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira um número inteiro: ");
        int n = scan.nextInt();
        String num = Integer.toString(n);
        int sum = 0;
        for(int i = 0; i < num.length(); i++){
            if((num.charAt(i) - '0') % 2 == 0){
                sum += num.charAt(i) - '0';
            }
        }
        System.out.println("A soma dos dígitos pares é " + sum);

        scan.close();
    }
}
