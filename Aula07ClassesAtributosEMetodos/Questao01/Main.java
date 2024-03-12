package Aula07ClassesAtributosEMetodos.Questao01;

public class Main {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("007",
         "Eduardo", "28072004", "M",
          "Unimed", "Dipirona", "O-");
        
        System.out.println("Código: " + paciente1.codigo);
        System.out.println("Nome: " + paciente1.nome);
        System.out.println("Nascimento: " + paciente1.dataNascimento);
        System.out.println("Sexo: " + paciente1.sexo);
        System.out.println("Plano de Saúde: " + paciente1.planoSaude);
        System.out.println("Alergia(s): " + paciente1.alergia);
        System.out.println("Tipo Sanguíneo: " + paciente1.tipoSanguineo);
        
        paciente1.modificar("001",
        "Marcos", "01101969", "M",
        "Unimed", "Nenhuma", "A+");
        
        System.out.println("Código: " + paciente1.codigo);
        System.out.println("Nome: " + paciente1.nome);
        System.out.println("Nascimento: " + paciente1.dataNascimento);
        System.out.println("Sexo: " + paciente1.sexo);
        System.out.println("Plano de Saúde: " + paciente1.planoSaude);
        System.out.println("Alergia(s): " + paciente1.alergia);
        System.out.println("Tipo Sanguíneo: " + paciente1.tipoSanguineo);
    }
}
