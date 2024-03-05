package Aula04EstruturasDeDecisao;
import java.util.Scanner;

public class questao10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira um número de 1 a 12: ");
        int mes = scan.nextInt();
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", //
        "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", //
        "Novembro", "Dezembro"};
        for(int i = 0; i < 12; i++){
            if(mes == i){ System.out.println(meses[i-1]); }
        }
        
        scan.close();
    }
}
