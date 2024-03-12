package Aula05EstruturasDeRepeticao;
import java.util.Scanner;

public class questao20 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float media = 0, tres = 0;
        while(scan.hasNext()){
            int n = scan.nextInt();
            if(n == 0){ break; }
            if(n % 3 == 0){ 
                media += n;
                tres++;
            }
        }
        media /= tres;
        System.out.println(media);

        scan.close();
    }
}
