package Aula13TratamentoDeExcecoes;

public class Main {
    @SuppressWarnings({ "null", "unused" })
    public static void main(String[] args) {
        try {
            int num = 10 / 0;
            String str = null;
            str.charAt(0);
        } catch (ArithmeticException error) {
            System.out.println("Não é possível dividir por zero");
        } catch (IndexOutOfBoundsException error) {
            System.out.println("Index não existe");
        }
    }
}