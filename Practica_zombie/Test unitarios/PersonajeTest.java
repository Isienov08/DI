import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonajeTest {

    // Maniquí: implementa lo abstracto sin lógica
    private static class PersonajePrueba extends Personaje {
        PersonajePrueba(int vida, int ataque) { super(vida, ataque); }
        @Override public int ataca(GestorDados dados) { return 0; }
        @Override public void recibirDanio(int tiradaAtaqueRival) { }
    }

    @Test
    void estaVivo_conVidaPositiva_devuelveTrue() {
        assertTrue(new PersonajePrueba(5, 3).estaVivo());
    }

    @Test
    void estaVivo_conVidaCero_devuelveFalse() {
        assertFalse(new PersonajePrueba(0, 3).estaVivo());
    }

    @Test
    void setVidaActual_conValorNegativo_quedaEnCero() {
        Personaje p = new PersonajePrueba(5, 3);
        p.setVidaActual(-10);
        assertEquals(0, p.getVidaActual());
    }

}