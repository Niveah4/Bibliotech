package modelos.GestaoLivros.Services;

import modelos.GestaoLivros.Entidade.Livro;
import java.util.List;

public class ExibeLivros {
    private List<Livro> livros;

    public void exibirTodosLivros() {
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }
    
}
