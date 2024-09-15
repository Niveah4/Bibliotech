package modelos.exceptions;

import java.io.IOException;

public class InvalidOpcaoFormatException  extends IOException{

    public InvalidOpcaoFormatException(){
        super ();
    }
    public InvalidOpcaoFormatException(String mensagem){
        super (mensagem);
    }
    
    
}
