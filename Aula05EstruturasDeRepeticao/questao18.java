package Aula05EstruturasDeRepeticao;
import java.util.Scanner;

public class questao18 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int par = 0, impar = 0;
        while(scan.hasNext()){
            int n = scan.nextInt();
            if(n == 0){ break; }
            if(n % 2 == 0){ par++; }
            else{ impar++; }
        }
        System.out.println(par + " números pares");
        System.out.println(impar + " números ímpares");

        scan.close();
    }
}
