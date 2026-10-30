
package com.gqs.aula.senha;

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
}
