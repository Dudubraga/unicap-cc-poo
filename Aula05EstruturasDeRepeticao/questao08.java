package Aula05EstruturasDeRepeticao;
import java.util.Scanner;

public class questao08 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i = 1, sum = 0;
        while(i <= 100){
            sum += i; i++;
        }
        System.out.println(sum);

        scan.close();
    }
}
