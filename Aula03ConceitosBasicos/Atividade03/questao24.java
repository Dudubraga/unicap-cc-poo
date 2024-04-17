package Aula03ConceitosBasicos.Atividade03;
import java.util.Scanner;

public class questao24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira sua cidade: ");
        String cidade = scan.nextLine();
        System.out.print("Insira seu estado: ");
        String estado = scan.nextLine();
        String local = cidade + ", " + estado;
        System.out.println("Você mora em " + local);

        scan.close();
    }
}
