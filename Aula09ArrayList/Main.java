import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Eduardo", 51000, 20);
        Funcionario f2 = new Funcionario("Lucas", 55000, 31);
        Funcionario f3 = new Funcionario("Julia", 49000, 29);
        
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);

        for(int i = 0; i < funcionarios.size(); i++){
            if(funcionarios.get(i).salarioAnual > 50000 && funcionarios.get(i).idade < 30){
                System.out.println(funcionarios.get(i).nome);
            }
        }
    }
}