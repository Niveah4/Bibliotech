package modelos.validacoes;

import modelos.exceptions.InvalidCpfFormat;

public class ValidacaoCpf {

    public static void validarCpf (String cpf) throws InvalidCpfFormat{

        if (!(cpf.length() == 11)) {
           throw new InvalidCpfFormat ("CPF não contém 11 dígitos. Tente Novamente");
        } else if (cpf.isEmpty()) {
            throw new InvalidCpfFormat ("Campo CPF está vazio.");
        } else if (!cpf.matches("\\d+")) { 
            throw new InvalidCpfFormat ("O CPF deve conter apenas números.");
        }else if (cpf.equals("00000000000")){
            throw new InvalidCpfFormat ("O CPF não pode conter sequencia de zeros.");
        }
       
    }
    
}
