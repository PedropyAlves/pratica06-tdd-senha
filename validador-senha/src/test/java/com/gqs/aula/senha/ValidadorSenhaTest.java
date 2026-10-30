
package com.gqs.aula.senha;

import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class ValidadorSenhaTest {

    @Test
    void deveRejeitarSenhaComMenosDe8Caracteres() {
        ValidadorSenha validador = new ValidadorSenha();

        boolean resultado = validador.validar("Ab12!");

        assertFalse(resultado);
    }
}

