
package com.gqs.aula.senha;
import java.util.ArrayList;
import java.util.List;

public class ValidadorSenha {

    public boolean validar(String senha) {
        if (senha == null || senha.length() < 8) {
            return false;
        }

        int quantidadeDigitos = 0;
        boolean temMaiuscula = false;
        boolean temEspecial = false;

        for (char caractere : senha.toCharArray()) {
            if (Character.isDigit(caractere)) {
                quantidadeDigitos++;
            }

            if (Character.isUpperCase(caractere)) {
                temMaiuscula = true;
            }

            if (!Character.isLetterOrDigit(caractere)) {
                temEspecial = true;
            }
        }

        return quantidadeDigitos >= 2
                && temMaiuscula
                && temEspecial;
    }
    
public List<String> validarComErros(String senha) {
    List<String> erros = new ArrayList<>();

    if (senha == null) {
        senha = "";
    }

    if (senha.length() < 8) {
        erros.add("A senha deve ter pelo menos 8 caracteres");
    }

    int quantidadeDigitos = 0;
    boolean temMaiuscula = false;
    boolean temEspecial = false;

    for (char caractere : senha.toCharArray()) {
        if (Character.isDigit(caractere)) {
            quantidadeDigitos++;
        }

        if (Character.isUpperCase(caractere)) {
            temMaiuscula = true;
        }

        if (!Character.isLetterOrDigit(caractere)
                && !Character.isWhitespace(caractere)) {
            temEspecial = true;
        }
    }

    if (quantidadeDigitos < 2) {
        erros.add("A senha deve conter pelo menos 2 dígitos");
    }

    if (!temMaiuscula) {
        erros.add("A senha deve conter ao menos uma letra maiúscula");
    }

    if (!temEspecial) {
        erros.add("A senha deve conter pelo menos um caractere especial");
    }

    return erros;
}

}
