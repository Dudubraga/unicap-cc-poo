package Aula05EstruturasDeRepeticao.Atividade05;
import java.util.Scanner;

public class questao23 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int low = 1000000000;
        while(scan.hasNext()){
            int n = scan.nextInt();
            if(n == 0){ break; }
            if(n % 2 != 0 && n < low){ low = n; }
        }
        System.out.println(low + " é o menor ímpar inserido");

        scan.close();
    }
}
