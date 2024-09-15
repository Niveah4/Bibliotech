package modelos.Service;

import java.util.Scanner;
import modelos.exceptions.InvalidNomeFormatException;
import modelos.validacoes.ValidacaoMatricula;

public class SolicitaMatricula {

   public static Scanner scann = new Scanner(System.in);

    public static String solicitarMatricula() {
        String matricula;
        while(true){
            System.out.println("Digite sua matricula:");
            matricula= scann.nextLine();
            try{
                ValidacaoMatricula.validarMatricula(matricula);
                System.out.println("Matricula válida!");
                break;
            }catch(InvalidNomeFormatException e){
                  System.out.println("Matricula inválida: " + e.getMessage());
            }
       }
                return matricula;
    }
    
}
