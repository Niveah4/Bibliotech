package modelos.GestaoLivros.Filtros;

import modelos.GestaoLivros.Entidade.Livro;
import java.util.List;
import java.util.ArrayList;

public class Titulo {

    private List<Livro> livros;

     public List<Livro> buscarPorTitulo(String titulo) {
        List<Livro> resultado = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                resultado.add(livro);
            }
        }
        return resultado;
    }
    
}
