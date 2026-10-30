
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
    @Test
void deveRejeitarSenhaComMenosDeDoisDigitos() {
    ValidadorSenha validador = new ValidadorSenha();

    boolean resultado = validador.validar("Abcdefg1!");

    assertFalse(resultado);
}

@Test
void deveRejeitarSenhaSemLetraMaiuscula() {
    ValidadorSenha validador = new ValidadorSenha();

    boolean resultado = validador.validar("abcdef12!");

    assertFalse(resultado);
}

@Test
void deveRejeitarSenhaSemCaractereEspecial() {
    ValidadorSenha validador = new ValidadorSenha();

    boolean resultado = validador.validar("Abcdef12");

    assertFalse(resultado);
}

}

