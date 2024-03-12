package Aula05EstruturasDeRepeticao;
import java.util.Scanner;

public class questao13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String num = Integer.toString(n);
        int i = 0, sum = 0;
        while(i < num.length()){
            sum += num.charAt(i) - '0';
            i++;
        }
        sum = sum * sum * sum;
        System.out.println(sum);

        scan.close();
    }
}
