package modelos.Service;

import java.util.Scanner;
import modelos.exceptions.InvalidEmailFormatException;
import modelos.validacoes.ValidacaoEmail;

public class SolicitaEmail {

   public static Scanner scann = new Scanner(System.in);

    
    public static String solicitarEmail() {
        String email;
        while (true) {
            System.out.println("Digite seu email:");
            email = scann.nextLine();
            try {
                ValidacaoEmail.validarEmail(email);
                System.out.println("Email válido.");
                break;
            } catch (InvalidEmailFormatException e) {
                System.out.println("Email inválido: " + e.getMessage());
                System.out.println("Insira seu email novamente.");
            }
        }
        return email;
    }
    
}
