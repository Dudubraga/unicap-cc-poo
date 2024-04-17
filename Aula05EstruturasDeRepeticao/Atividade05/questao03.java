package Aula05EstruturasDeRepeticao.Atividade05;
import java.util.Scanner;

public class questao03 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira um número inteiro: ");
        int n = scan.nextInt();
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.print(i + ", ");
            }
        } System.out.println("são os divisores de " + n);

        scan.close();
    }
}
