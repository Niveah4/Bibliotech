package modelos.GestaoLivros.Filtros;

import modelos.GestaoLivros.Entidade.Livro;
import java.util.List;
import java.util.ArrayList;

public class Categoria {
    private List<Livro> livros;

     public List<Livro> buscarPorCategoria(String categoria) {
        List<Livro> resultado = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.getCategoria().equalsIgnoreCase(categoria)) {
                resultado.add(livro);
            }
        }
        return resultado;
    }
    
}
