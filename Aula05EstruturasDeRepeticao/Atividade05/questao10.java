package Aula05EstruturasDeRepeticao.Atividade05;
import java.util.Scanner;

public class questao10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i = 1;
        while(i <= 10){
            System.out.println(i * 9);
            i++;
        }

        scan.close();
    }
}
