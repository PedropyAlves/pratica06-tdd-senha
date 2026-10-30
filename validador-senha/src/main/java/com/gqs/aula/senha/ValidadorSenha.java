
package com.gqs.aula.senha;

public class ValidadorSenha {

    public boolean validar(String senha) {
        return senha != null && senha.length() >= 8;
    }
}
