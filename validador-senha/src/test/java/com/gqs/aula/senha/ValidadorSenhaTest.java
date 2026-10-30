
package com.gqs.aula.senha;

import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

@Test
void deveRetornarMultiplosErrosParaSenhaInvalida() {
    ValidadorSenha validador = new ValidadorSenha();

    List<String> erros = validador.validarComErros("mypass");

    assertEquals(4, erros.size());

    assertEquals("A senha deve ter pelo menos 8 caracteres", erros.get(0));
    assertEquals("A senha deve conter pelo menos 2 dígitos", erros.get(1));
    assertEquals("A senha deve conter ao menos uma letra maiúscula", erros.get(2));
    assertEquals("A senha deve conter pelo menos um caractere especial", erros.get(3));
}

@Test
void deveAceitarSenhaValida() {
    ValidadorSenha validador = new ValidadorSenha();

    boolean resultado = validador.validar("Abcdef12!");

    assertTrue(resultado);
}

}

