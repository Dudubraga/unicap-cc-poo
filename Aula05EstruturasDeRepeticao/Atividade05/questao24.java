package Aula05EstruturasDeRepeticao.Atividade05;
import java.util.Scanner;

public class questao24 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int pri = 0, ult = 0;
        while(scan.hasNext()){
            int n = scan.nextInt();
            if(n == 0){ break; }
            if(pri == 0){ pri = n; }
            ult = n;
        }
        int impares = 0, i = pri;
        while(i <= ult){
            if(i % 2 != 0){ impares++; }
            i++;
        }
        System.out.println("Entre os números " + 
        pri + " e " + ult + " existem " + impares + 
        " números impares");

        scan.close();
    }
}
