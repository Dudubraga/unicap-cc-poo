package Aula06ArraysEFuncoes.Atividade06;

public class questao22 {
    public static void print(int n){
        for(int i = 1; i <= n; i++){
            String s = "";
            for(int j = 1; j <= i; j++){
                s += "!";
            }
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        int n = 6;
        print(n);
    }
}
