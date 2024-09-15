package modelos.GestaoLivros.Services;
import modelos.GestaoLivros.Entidade.Livro;

import java.util.List;
   
public class RemoveLivro {
    private List<Livro> livros;

    public void removerLivro(String isbn) {
        livros.removeIf(livro -> livro.getIsbn().equals(isbn));
        System.out.println("Livro com ISBN " + isbn + " foi removido.");
    }
    
}
