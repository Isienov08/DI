import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ZombieTest {

    @Test
    void recibirDanio_mayorQueLaVida_dejaVidaEnCeroYMuere() {
        Zombie zombie=new Zombie(5,3);
        zombie.recibirDanio(10);

        assertEquals(0, zombie.getVidaActual());
        assertFalse(zombie.estaVivo());
    }

    @Test
    void recibirDanio_menorQueLaVida_restaVidaYSigueVivo() {
        Zombie zombie=new Zombie(5,3);
        zombie.recibirDanio(4);

        assertTrue(zombie.getVidaActual()==1 && zombie.estaVivo());
    }

    @Test
    void recibirDanio_igualALaVida_dejaVidaEnCeroYMuere() {
        Zombie zombie = new Zombie(5, 3);
        zombie.recibirDanio(5);

        assertEquals(0, zombie.getVidaActual());
        assertFalse(zombie.estaVivo());
    }

    @Test
    void ataca_siempreDevuelveValorEntre1YElAtaque() {
        Zombie zombie = new Zombie(5, 4);
        GestorDados dados = new GestorDados(new Random(42));

        for (int i = 0; i < 100; i++) {
            int resultado = zombie.ataca(dados);
            assertTrue(resultado >= 1 && resultado <= 4);
        }
    }
}