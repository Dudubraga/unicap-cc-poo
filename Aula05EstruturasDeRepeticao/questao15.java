package Aula05EstruturasDeRepeticao;
import java.util.Scanner;

public class questao15 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i = 1;
        while(i <= 50){
            if(i % 3 == 0){
                System.out.println(i);
            } i++;
        }

        scan.close();
    }
}
