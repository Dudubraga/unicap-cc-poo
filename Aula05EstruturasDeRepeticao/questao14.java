package Aula05EstruturasDeRepeticao;
import java.util.Scanner;

public class questao14 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i = 1;
        while(i <= 100){
            if(i % 2 != 0){
                System.out.println(i);
            } i++;
        }

        scan.close();
    }
}
