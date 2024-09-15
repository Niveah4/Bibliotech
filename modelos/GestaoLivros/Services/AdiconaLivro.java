package modelos.GestaoLivros.Services;

import modelos.GestaoLivros.Entidade.Livro;
import java.util.List;

public class AdiconaLivro {

    private List<Livro> livros;

     public void adicionarLivro(Livro livro) {

        livros.add(livro);

        System.out.println("Livro adicionado: " + livro.getTitulo());
    }
    
}
