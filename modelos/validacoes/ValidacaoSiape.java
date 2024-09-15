package modelos.validacoes;

import modelos.exceptions.InvalidSiapeFormat;

public class ValidacaoSiape {

    public static void validarMatricula(String matricula) throws InvalidSiapeFormat{
        if (matricula == null || matricula.isEmpty()) {
            throw new  InvalidSiapeFormat ("Matrícula SIAPE não pode ser nulo ou vazio.");
        }
        if(matricula.length() != 6){
            throw new  InvalidSiapeFormat("Matrícula SIAPE deve possuir 6 dígitos numéricos.");
         }
         if (!matricula.matches("\\d+")) { 
            throw new  InvalidSiapeFormat("Matrícula SIAPE deve conter apenas números.");
        }
    }
    
}
