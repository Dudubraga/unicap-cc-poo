public class Main{
    public static void main(String[] args) {
        Empresa empresa = new Empresa("nome","111", 
        "disney", 0, "mark");
        Trabalhador trabalhador1 = new Trabalhador("eduardo", 19, 
        50, 0, false);
        Trabalhador trabalhador2 = new Trabalhador("henrique", 18, 
        55, 0, true);
        // saída
        System.out.println(empresa.getNome());
        System.out.println(empresa.getCnpj());
        System.out.println(empresa.getEndereco());
        System.out.println(empresa.getNum_funcionarios());
        System.out.println(empresa.getCeo());
        System.out.println();
        // contratar 2 trabalhadores
        empresa.contratar(trabalhador1);
        empresa.contratar(trabalhador2);
        // saída após contratação
        System.out.println(empresa.getNome());
        System.out.println(empresa.getCnpj());
        System.out.println(empresa.getEndereco());
        System.out.println(empresa.getNum_funcionarios());
        System.out.println(empresa.getCeo());
        System.out.println();
        // saída
        for(int i = 0; i < empresa.getNum_funcionarios(); i++){
            System.out.println(empresa.getTrabalhadores()[i].getNome());
            System.out.println(empresa.getTrabalhadores()[i].getIdade());
            System.out.println(empresa.getTrabalhadores()[i].getValor_hora());
            System.out.println(empresa.getTrabalhadores()[i].getHoras_trabalhadas());
            System.out.println(empresa.getTrabalhadores()[i].isFerias());
            System.out.println();
        }
        // trabalha
        empresa.trabalhar(); System.out.println("Após primeiro trabalho:");
        // saída
        for(int i = 0; i < empresa.getNum_funcionarios(); i++){
            System.out.println(empresa.getTrabalhadores()[i].getNome());
            System.out.println(empresa.getTrabalhadores()[i].getIdade());
            System.out.println(empresa.getTrabalhadores()[i].getValor_hora());
            System.out.println(empresa.getTrabalhadores()[i].getHoras_trabalhadas());
            System.out.println(empresa.getTrabalhadores()[i].isFerias());
            System.out.println();
        }
        // trocar as ferias 
        for(int i = 0; i < empresa.getNum_funcionarios(); i++){
            empresa.getTrabalhadores()[i].ferias();
        }
        // trabalha novamente
        empresa.trabalhar(); System.out.println("Após troca de Férias e mais um trabalho:");
        // saída
        for(int i = 0; i < empresa.getNum_funcionarios(); i++){
            System.out.println(empresa.getTrabalhadores()[i].getNome());
            System.out.println(empresa.getTrabalhadores()[i].getIdade());
            System.out.println(empresa.getTrabalhadores()[i].getValor_hora());
            System.out.println(empresa.getTrabalhadores()[i].getHoras_trabalhadas());
            System.out.println(empresa.getTrabalhadores()[i].isFerias());
            System.out.println();
        }
        // pagamento total
        double valor = empresa.calcularPagamento();
        System.out.println("A empresa deve desembolsar R$" + valor);
    }    
}