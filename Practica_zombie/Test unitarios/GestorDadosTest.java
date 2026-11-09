import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GestorDadosTest {

    @Test
    void tirarDado() {
        // Arrange: creamos la instancia a probar
        GestorDados gestor = new GestorDados();

        // Act: ejecutamos el método (por ejemplo, tirando un dado de 6 caras)
        int resultado = gestor.tirarDado(6);

        // Assert: verificamos que el resultado esté en el rango válido [1, 6]
        assertTrue(resultado >= 1 && resultado <= 6, "El resultado debe estar entre 1 y 6");
    }

    @Test
    void numeroAleatorio() {
        GestorDados gestor = new GestorDados();

        int limite = 10;
        int resultado = gestor.numeroAleatorio(limite);

        assertTrue(resultado >= 1 && resultado <= limite, "El número aleatorio debe estar dentro del límite");
    }
}