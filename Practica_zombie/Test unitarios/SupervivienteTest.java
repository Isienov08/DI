import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SupervivienteTest {

    @Test
    void usarBotiquinConVidaLlenaNoSuperaVidaMax() {
        Superviviente s = new Superviviente();   // Arrange
        s.recogerBotiquin();

        boolean curado = s.usarBotiquin();       // Act

        assertTrue(curado);                      // Assert
        assertEquals(Superviviente.VIDA_MAX, s.getVidaActual());
        assertFalse(s.isBotiquin());
    }
}