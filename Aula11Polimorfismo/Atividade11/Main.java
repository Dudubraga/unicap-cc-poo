public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Polimorfismo", 2024, 2,
        "01/04/2024", "Augusto");
        System.out.println(livro.getNumCopias() + " Copias do livro " + livro.getTitulo() + " disponíveis.");
        livro.emprestarItem(livro);
        livro.emprestarItem(livro);
        System.out.println(livro.getNumCopias() + " Copias do livro " + livro.getTitulo() + " disponíveis.");        
        livro.emprestarItem(livro);
        livro.devolverItem(livro);
        livro.devolverItem(livro);
        System.out.println(livro.getNumCopias() + " Copias do livro " + livro.getTitulo() + " disponíveis.");
        
    }
}
