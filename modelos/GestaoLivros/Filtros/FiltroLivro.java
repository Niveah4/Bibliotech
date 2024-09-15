package modelos.GestaoLivros.Filtros;

import modelos.GestaoLivros.Entidade.Livro;
import java.util.List;
import java.util.ArrayList;

public class FiltroLivro {
    private List<Livro> livros;

    public List<Livro> buscarPorAutor(String autor) {
        
        List<Livro> resultado = new ArrayList<>();

        for (Livro livro : livros) {
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                resultado.add(livro);
            }
        }
        return resultado;
    }

    
}
