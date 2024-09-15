package modelos.Service;

import java.util.Scanner;

import modelos.exceptions.InvalidSenhaFormatException;
import modelos.validacoes.ValidacaoSenha;

public class SolicitaSenha {

       public static Scanner scann = new Scanner(System.in);

      public static String solicitarSenha() {
        String senha;
            while(true){
                
                System.out.println("Digite sua senha:");
                senha= scann.nextLine();
                try{
                    ValidacaoSenha.validarSenha(senha);
                    System.out.println("Senha válida!");
                    break;
                }catch(InvalidSenhaFormatException e){
                      System.out.println("Senha inválida: " + e.getMessage());
                }
           }
        return senha;
    }
    
}
