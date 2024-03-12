package Aula05EstruturasDeRepeticao;
import java.util.Scanner;

public class questao12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int media = 0, nums = 0;
        while(scan.hasNext()){
            int n = scan.nextInt();
            if(n == -1){ break; }
            nums++;
            media += n;
        }
        media /= nums;
        System.out.println(media + " é a média");

        scan.close();
    }
}
