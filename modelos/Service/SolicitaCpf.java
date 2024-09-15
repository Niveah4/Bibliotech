package modelos.Service;

import java.util.Scanner;
import modelos.exceptions.InvalidCpfFormat;
import modelos.validacoes.ValidacaoCpf;

public class SolicitaCpf {
        
     public static Scanner scann = new Scanner(System.in);

    public static String solicitarCpf() {
        String cpf;
            while (true) {
               System.out.println("Digite seu CPF:");
               cpf = scann.nextLine();
                try{
                    ValidacaoCpf.validarCpf(cpf);
                    System.out.println("CPF válido!");
                    break;
                }catch(InvalidCpfFormat e){
                    System.out.println(e.getMessage());
                }
            }
        return cpf;
    }
    
}
