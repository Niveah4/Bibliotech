package modelos.GestaoLivros.Exceptions;

public class IsbnFormatoInvalidoException  extends Exception{

    public IsbnFormatoInvalidoException (){
        super();
    }

    
    public IsbnFormatoInvalidoException (String mensagem){
        super(mensagem);
    }
    
}
