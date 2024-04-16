import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // iniciando um programador
        Programador programador = new Programador("Eduardo", 20000);
        programador.setLinguagem("C++");
        // iniciando um designer
        Designer designer = new Designer("Julia", 40000);
        designer.setSoftwareEdicao("Photoshop");
        // lista de funcionários sem tamanho determinado
        ArrayList<Funcionarios> funcionarios = new ArrayList<>();
        funcionarios.add(programador);
        funcionarios.add(designer);
        // saída de informações
        for(Funcionarios f : funcionarios){
            System.out.println(f.getClass());
            System.out.println("Nome: " + f.getNome());
            System.out.println("Salário: " + f.getSalario());
            System.out.println("Bonus: " + f.calcularBonificacao());
            System.out.println();
        }
        programador.darAula();
    }
}
