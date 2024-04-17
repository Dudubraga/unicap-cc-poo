package Aula05EstruturasDeRepeticao.Atividade05;
import java.util.Scanner;

public class questao09 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int prod = 1, i = 1;
        while(i <= 5){
            prod *= i; i++;
        }
        System.out.println(prod);

        scan.close();
    }
}
