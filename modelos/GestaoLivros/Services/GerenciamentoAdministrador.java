package modelos.GestaoLivros.Services;

import modelos.Entidades.Admnistrador;
import modelos.Entidades.Leitor;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class GerenciamentoAdministrador {

    public static Map<String, Leitor> leitores = new HashMap<>();
    public static Map<String, Admnistrador> administradores = new HashMap<>();
    
    public static void menu(String nome) {
        Scanner scann = new Scanner(System.in);

         System.out.println("\n........PORTAL DO ADM.........");
          nome = nome.toUpperCase();
          System.out.println("\nOlá, " + nome + "!\n");

        while (true) {

            System.out.println("         --------MENU DO ADMNISTRADOR: --------");
          System.out.println ("\n1-CADASTRAR USUARIO" +
            "\n2-CADASTRAR LIVRO" +
            "\n3-PEGAR LIVRO EMPRESTADO" +
            "\n4-DEVOLVER UM LIVRO" +
            "\n5-MOSTRAR USUÁRIOS CADASTRADOS" +
            "\n6-MOSTRAR USUARIOS E SEUS LIVROS" +
            "\n7-MOSTRAR TODOS OS LIVROS" +
            "\n8-EDITAR INF. DOS LIVROS" +
            "\n9-EDITAR INF. USUÁRIO"+
            "\n10-PARAR A APLICAÇÃO");


            System.out.println("Digite uma opção entre 1 e 10:");
            int opc = scann.nextInt();

            switch (opc) {
                case 1:
                    break;
                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    System.out.println("Saindo do sistema de Admnistrador... Até logo!");
                    return;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
            scann.close();
        }
    }
}

