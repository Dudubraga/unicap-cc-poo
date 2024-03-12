package Aula05EstruturasDeRepeticao;
import java.util.Scanner;

public class questao04 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira as 5 alturas abaixo:");
        float media = 0;
        for(int i = 0; i < 5; i++){
            float altura = scan.nextFloat();
            media += altura;
        }
        media /= 5;
        System.out.println(media + " é a média de altura");

        scan.close();
    }
}
