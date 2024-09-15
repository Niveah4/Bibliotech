package modelos.GestaoLivros.Services;

import modelos.Entidades.Admnistrador;
import modelos.Entidades.Leitor;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// import java.util.ArrayList;
// import java.util.List;

// import modelos.GestaoLivros.Entidade.Livro;

public class GerenciamentoLeitor {

    public static Map<String, Leitor> leitores = new HashMap<>();
    public static Map<String, Admnistrador> administradores = new HashMap<>();
    // Leitor leitor = RealizaCadastro.leitores.get(nome); // Buscar no mapa de
    // leitores

    public static void menuLivro(String nome) {
        Scanner scann = new Scanner(System.in);

        // System.out.println("\n.........Quase lá.........");
        nome = nome.toUpperCase();
        System.out.println("\nOlá, " + nome + "!\n");

        while (true) {

            System.out.println("         --------MENU DO LEITOR: --------");
            System.out.println("1 - Buscar por livros disponíveis");
            System.out.println("2 - Realizar empréstimos");
            System.out.println("3 - Devolver exemplares");
            System.out.println("4 - Histórico de empréstimos");
            System.out.println("5 - Sair");

            System.out.println("Digite uma opção entre 1 e 5:");
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
                    System.out.println("Saindo do sistema de Leitor... Até logo!");
                    return;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
            scann.close();
        }
    }
}
