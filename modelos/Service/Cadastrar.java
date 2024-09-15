package modelos.Service;

import java.util.Scanner;

import modelos.Entidades.Admnistrador;
import modelos.Entidades.Leitor;

public class Cadastrar {

    public static Scanner scann = new Scanner(System.in);

    public static Leitor cadastrarLeitor(String nome) {
        String email =  SolicitaEmail.solicitarEmail();
        String cpf = SolicitaCpf.solicitarCpf();
        String senha = SolicitaSenha.solicitarSenha();
        String matricula = SolicitaMatricula.solicitarMatricula();
        
        return new Leitor(nome, email, cpf, senha, matricula);
    }

    public static Admnistrador cadastrarAdministrador(String nome) {
        String email = SolicitaEmail.solicitarEmail();
        String cpf = SolicitaCpf.solicitarCpf();
        String senha = SolicitaSenha.solicitarSenha();
        String siape = SolicitaSiape.solicitarSiape();
        
        return new Admnistrador(nome, email, cpf, senha, siape);
    }  
}
