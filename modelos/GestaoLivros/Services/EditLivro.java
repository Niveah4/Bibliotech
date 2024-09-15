package modelos.GestaoLivros.Services;

import modelos.GestaoLivros.Entidade.Livro;
import java.util.List;

public class EditLivro {

    private List<Livro> livros;

     public void editarLivro(String isbn, String novoTitulo, String novoAutor, String novaCategoria, int novaQuantidade) {
        for (Livro livro : livros) {
            if (livro.getIsbn().equals(isbn)) {
                livro.setTitulo(novoTitulo);
                livro.setAutor(novoAutor);
                livro.setCategoria(novaCategoria);
                livro.setQuantidade(novaQuantidade);
                System.out.println("Livro com ISBN " + isbn + " foi editado.");
                return;
            }
        }
        System.out.println("Livro com ISBN " + isbn + " não encontrado.");
    }
    
}
