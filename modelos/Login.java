package modelos;

import java.util.HashMap;
import java.util.Map;

import modelos.Entidades.Admnistrador;
import modelos.Entidades.Leitor;


public class Login {
    // Armazenar usuários para simular um banco de dados
    public static Map<String, Leitor> leitores = new HashMap<>();
    public static Map<String, Admnistrador> administradores = new HashMap<>();
}
