package Aula07ClassesAtributosEMetodos.Questao02;

public class Main {
    public static void main(String[] args) {
        Endereco end = new Endereco("do Principe", "526", 
        "Bloco B", "Boa Vista", "Recide", 
        "PE", "50050-900");
        
        System.out.print("Rua " + end.rua + ", nº " + end.numero);
        System.out.println("Complemento: " + end.complemento);
        System.out.println("Bairro: " + end.bairro);
        System.out.println("Cidade: " + end.cidade);
        System.out.println("UF: " + end.uf);
        System.out.println("CEP: " + end.cep);
        
        Medico med = new Medico("40028922", "Yudi", 
        "M", "Urologia", end);
        
        System.out.println("Dr(a) " + med.nome);
        System.out.println("Código: " + med.codigo);
        System.out.println("Sexo: " + med.sexo);
        System.out.println("Especialidade: " + med.especialidade);
        
        end.modificarEndereco("do Bobo", "Zero", 
        "n/a", "Bairro", "Cidade", 
        "Estado", "123456");
        
        med.modificarMedico("0123", "Nome", 
        "M/F", "Geral", end);
        
        System.out.println("\nAlterados:");
        System.out.println("Dr(a) " + med.nome);
        System.out.println("Código: " + med.codigo);
        System.out.println("Sexo: " + med.sexo);
        System.out.println("Especialidade: " + med.especialidade);

        System.out.print("Rua " + end.rua + ", nº " + end.numero);
        System.out.println("Complemento: " + end.complemento);
        System.out.println("Bairro: " + end.bairro);
        System.out.println("Cidade: " + end.cidade);
        System.out.println("UF: " + end.uf);
        System.out.println("CEP: " + end.cep);
    }    
}
