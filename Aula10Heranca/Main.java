import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Programador programador = new Programador("Eduardo", 20000, "C++");
        
        Designer designer = new Designer("Julia", 40000, "Photoshop");
        
        ArrayList<Funcionarios> funcionarios = new ArrayList<>();
        funcionarios.add(programador);
        funcionarios.add(designer);
        
        for(Funcionarios f : funcionarios){
            System.out.println(f.getClass());
            System.out.println("Nome: " + f.getNome());
            System.out.println("Salário: " + f.getSalario());
            System.out.println("Bonus: " + f.calcularBonificacao());
            System.out.println();
        }
    }
}
