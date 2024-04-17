package Aula06ArraysEFuncoes.Atividade06;

public class questao24 {
    public static void triangulo(int n){
        int tam = 2 * n - 1;
        String s = " ";
        String c = "*";
        for(int i = 1; i <= n; i++){
            int esp = tam / 2;
            System.out.println(s.repeat(esp) + c.repeat(2*i-1));
            tam -= 2;
        }
    }
    public static void main(String[] args) {
        int n = 6;
        triangulo(n);
    }
}
