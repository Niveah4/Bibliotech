package modelos.Service;

import java.util.Scanner;

import modelos.exceptions.InvalidSiapeFormat;
import modelos.validacoes.ValidacaoSiape;

public class SolicitaSiape {

       public static Scanner scann = new Scanner(System.in);

    public static String solicitarSiape() {
        System.out.println("Digite seu SIAPE:");
        String siape = scann.nextLine();

        while(true){
            try{
                ValidacaoSiape.validarMatricula(siape);
                System.out.println("SIAPE válido!");
                break;
            } catch(InvalidSiapeFormat e){
                System.out.println(e.getMessage());
            }
        }
        return siape;
    }
    
}
