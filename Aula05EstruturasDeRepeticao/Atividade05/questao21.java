package Aula05EstruturasDeRepeticao.Atividade05;
import java.util.Scanner;

public class questao21 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int tres = 0;
        while(scan.hasNext()){
            int n = scan.nextInt();
            if(n == 0){ break; }
            if(n > 99 && n < 1000){
                tres++;
            }
        }
        System.out.println(tres);

        scan.close();
    }
}
