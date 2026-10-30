
package com.gqs.aula.senha;

public class ValidadorSenha {

    public boolean validar(String senha) {
        if (senha == null || senha.length() < 8) {
            return false;
        }

        int quantidadeDigitos = 0;

        for (char caractere : senha.toCharArray()) {
            if (Character.isDigit(caractere)) {
                quantidadeDigitos++;
            }
        }

        return quantidadeDigitos >= 2;
    }
}
