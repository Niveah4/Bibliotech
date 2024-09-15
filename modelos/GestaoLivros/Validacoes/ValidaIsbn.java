package modelos.GestaoLivros.Validacoes;

import java.util.Scanner;
import modelos.GestaoLivros.Exceptions.IsbnFormatoInvalidoException;


public class ValidaIsbn {

    Scanner scann = new Scanner(System.in);

    public static void isValidIsbn(String isbn) throws IsbnFormatoInvalidoException {

        if (isbn == null || isbn.isEmpty())  {
            throw new IsbnFormatoInvalidoException("ISBN não pode ser nula ou vazia.");
        }
        if(isbn.length() != 6){
            throw new IsbnFormatoInvalidoException("ISBN deve possuir 6 dígitos numéricos.");
         }
         if (!isbn.matches("\\d+")) { 
            throw new IsbnFormatoInvalidoException("ISBN deve conter apenas números.");
        }
    }
    
}
