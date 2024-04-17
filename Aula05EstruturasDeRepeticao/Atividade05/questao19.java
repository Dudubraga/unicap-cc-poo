package Aula05EstruturasDeRepeticao.Atividade05;
import java.util.Scanner;

public class questao19 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int dois = 0, tres = 0, cinco = 0;
        while(scan.hasNext()){
            int n = scan.nextInt();
            if(n == 0){ break; }
            if(n % 2 == 0){ dois++; }
            if(n % 3 == 0){ tres++; }
            if(n % 5 == 0){ cinco++; }
        }
        System.out.println(dois + " números divisíveis por 2");
        System.out.println(tres + " números divisíveis por 3");
        System.out.println(cinco + " números divisíveis por 5");

        scan.close();
    }
}
