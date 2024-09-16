package modelos.UI;
import modelos.Entidades.Admnistrador;
import modelos.Entidades.Leitor;
import modelos.GestaoLivros.Services.GerenciamentoAdministrador;
import modelos.GestaoLivros.Services.GerenciamentoLeitor;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RealizaLogin {
    
    public static Map<String, Leitor> leitores = new HashMap<>();
    public static Map<String, Admnistrador> administradores = new HashMap<>();
    public static Scanner scann = new Scanner(System.in);
    static boolean loope;


    public static void realizarLogin() {

        // Verificar se há leitores ou administradores cadastrados
        if (RealizaCadastro.leitores.isEmpty() && RealizaCadastro.administradores.isEmpty()) {
            System.out.println("\nNenhum usuário cadastrado. Por favor, realize o cadastro primeiro.");
            return;  // Volta ao menu principal
        }

        System.out.println("Bem-vindo ao sistema de login!");
        System.out.println("Digite o tipo de usuário:");
        System.out.println("1 - Leitor");
        System.out.println("2 - Administrador");
        int tipoUsuario = scann.nextInt();
        scann.nextLine(); // Limpa o buffer do scanner

            if (tipoUsuario == 1) {

                if (RealizaCadastro.leitores.isEmpty()) {
                    System.out.println("\nNenhum Leitor cadastrado. Realize o cadastro primeiro.");
                    return;  // Volta ao menu principal
                }

                System.out.println("Digite número da matrícula:");
                String matricula = scann.nextLine();
                System.out.println("Digite sua senha:");
                String senha = scann.nextLine();

                Leitor leitor = RealizaCadastro.leitores.get(matricula); // Buscar no mapa de leitores

                if (leitor != null && leitor.login(matricula, senha)) {
                    System.out.println("\nLogin bem-sucedido como Leitor!");

                    loope = true;
                      System.out.println("\n.........Iniciando Sistema.........");
                    GerenciamentoLeitor.menuLivro(leitor.getNome());

                } else {
                    System.out.println("\nMatrícula ou senha inválidos para Leitor.");
                }

            }
             else if (tipoUsuario == 2) {
                if (RealizaCadastro.administradores.isEmpty()) {
                    System.out.println("Nenhum Administrador cadastrado. Realize o cadastro primeiro.");
                    return;  // Volta ao menu principal
                }

                System.out.println("Digite número do SIAPE:");
                String siape = scann.nextLine();
                System.out.println("Digite sua senha:");
                String senha = scann.nextLine();

                Admnistrador administrador = RealizaCadastro.administradores.get(siape); // Buscar no mapa de administradores

                if (administrador != null && administrador.login(siape, senha)) {
                    System.out.println("\nLogin bem-sucedido como Administrador!");

                    loope = true;
                    System.out.println("\n.........Iniciando Sistema.........");
                    GerenciamentoAdministrador.menu(administrador.getNome());




                } else {
                    System.out.println("Identificador ou senha inválidos para Administrador.");
                }
            } else {
                System.out.println("Tipo de usuário não identificado.");
            }
        }


        public static boolean stopWhile(){
            return loope;
        }
    
}
