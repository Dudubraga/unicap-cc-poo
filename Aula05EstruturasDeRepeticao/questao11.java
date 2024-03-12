package Aula05EstruturasDeRepeticao;
import java.util.Scanner;

public class questao11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int high = 0, low = 1000000000;
        while(scan.hasNext()){
            int n = scan.nextInt();
            if(n == 0){ break; }
            if(n > high){ high = n; }
            if(n < low){ low = n; }
        }
        System.out.println(low + " é o menor");
        System.out.println(high + " é o maior");

        scan.close();
    }
}
