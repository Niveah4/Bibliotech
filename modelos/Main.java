package modelos;

import java.util.Scanner;
import modelos.UI.*;
import modelos.Entidades.Admnistrador;
import modelos.Entidades.Leitor;
// import modelos.GestaoLivros.Services.GerenciamentoLeitor;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static Scanner scann = new Scanner(System.in); 
    // Armazenar usuários para simular um banco de dados
    public static Map<String, Leitor> leitores = new HashMap<>();
    public static Map<String, Admnistrador> administradores = new HashMap<>();
    public static void main(String[] args) {
     boolean isLoggedIn = false;  // Variável para controlar o estado de login

        while (!isLoggedIn) {  

            System.out.println("----------------Bem-vindo à Bibliotech!----------------");
            System.out.println("O que você deseja fazer?");
            System.out.println("1 - Cadastro");
            System.out.println("2 - Login");
            System.out.println("3 - Sair");

                int opcEntrada = scann.nextInt();
            // scann.nextLine();

                    switch (opcEntrada) {
                        case 1:
                            RealizaCadastro.realizarCadastro();  
                            break;
                        case 2:

                        RealizaLogin.realizarLogin();

                        isLoggedIn = RealizaLogin.stopWhile(); // Caso o login seja bem-sucedido, retornar true
                    if (isLoggedIn) {
                    } else {
                        System.out.println("Falha no login. Tente novamente.");
                    } 
                            break;
                        case 3:
                            System.out.println("Saindo do sistema... Até logo!");
                            return;  
                        default:
                            System.out.println("Opção inválida, tente novamente.");
                    }
        } 
        }
    }  

