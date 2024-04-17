package Aula05EstruturasDeRepeticao.Atividade05;
import java.util.Scanner;

public class questao22 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int media = 0, qnt = 0;
        while(scan.hasNext()){
            int n = scan.nextInt();
            if(n == 0){ break; }
            if(n >= 50 && n <= 100){
                media += n; qnt++;
            }
        }
        media /= qnt;
        System.out.println(media);

        scan.close();
    }
}
