import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HabitacionTest {

    @Test
    void constructor_estadoInicial_unZombieYTresIntentos() {
        Habitacion habitacion = new Habitacion(2);

        assertEquals(3, habitacion.getIntentosBusqueda());
        assertEquals(1, habitacion.getNumZombies());
    }

    @Test
    void constructor_numeroNegativo_quedaEnUno() {
        Habitacion habitacion = new Habitacion(-5);

        assertEquals(1, habitacion.getNumeroHabitacion());
    }

    @Test
    void eliminarZombie_conUnZombie_dejaLaSalaSinZombies() {
        Habitacion habitacion = new Habitacion(1);

        habitacion.eliminarZombie();

        assertEquals(0, habitacion.getNumZombies());
        assertFalse(habitacion.hayZombies());
    }

    @Test
    void eliminarZombie_deMas_noBajaDeCero() {
        Habitacion habitacion = new Habitacion(1);

        habitacion.eliminarZombie();
        habitacion.eliminarZombie();

        assertEquals(0, habitacion.getNumZombies());
    }

    @Test
    void anadirZombies_cantidadValida_sumaAlContador() {
        Habitacion habitacion = new Habitacion(1);

        habitacion.anadirZombies(2);

        assertEquals(3, habitacion.getNumZombies());
    }

    @Test
    void anadirZombies_cantidadNegativaOCero_noCambiaNada() {
        Habitacion habitacion = new Habitacion(1);

        habitacion.anadirZombies(-1);
        habitacion.anadirZombies(0);

        assertEquals(1, habitacion.getNumZombies());
    }

    @Test
    void gastarIntentoBusqueda_tresVeces_noQuedanIntentos() {
        Habitacion habitacion = new Habitacion(1);

        habitacion.gastarIntentoBusqueda();
        habitacion.gastarIntentoBusqueda();
        habitacion.gastarIntentoBusqueda();

        assertFalse(habitacion.quedanIntentosBusqueda());
    }

    @Test
    void gastarIntentoBusqueda_deMas_noBajaDeCero() {
        Habitacion habitacion = new Habitacion(1);

        for (int i = 0; i < 4; i++) {
            habitacion.gastarIntentoBusqueda();
        }

        assertEquals(0, habitacion.getIntentosBusqueda());
    }
}