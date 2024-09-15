package modelos.GestaoLivros.Filtros;

import modelos.GestaoLivros.Entidade.Livro;
import java.util.List;

public class Isbn {
    private List<Livro> livros;

    public Livro buscarPorIsbn(String isbn) {
        for (Livro livro : livros) {
            if (livro.getIsbn().equals(isbn)) {
                return livro;
            }
        }
        System.out.println("Livro com ISBN " + isbn + " não encontrado.");
        return null;
    }
}
