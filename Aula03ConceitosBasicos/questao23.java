package Aula03ConceitosBasicos;
import java.util.Scanner;

public class questao23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira uma data (dd/mm/aaaa): ");
        String str = scan.nextLine();
        String[] data = str.split("/");
        int dia = Integer.parseInt(data[0]);
        int mes = Integer.parseInt(data[1]);
        int ano = Integer.parseInt(data[2]);
        System.out.println("Dia " + dia + " do mês " + mes + " de " + ano);

        scan.close();
    }
}
