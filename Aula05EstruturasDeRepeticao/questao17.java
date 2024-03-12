package Aula05EstruturasDeRepeticao;
import java.util.Scanner;

public class questao17 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int pares = 0;
        Boolean p = false;
        while(scan.hasNext()){
            int n = scan.nextInt();
            if(n == 0){ break; }
            if(n % 2 == 0 && !p){
                pares++;
            }else{ p = true; }
        }
        System.out.println(pares);

        scan.close();
    }
}
