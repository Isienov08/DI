import java.util.Random;

public class GestorDados {
    private final Random random;

    public GestorDados() {
        this(new Random());
    }

    public GestorDados(Random random) { //para los test
        this.random = random;
    }

    public int tirarDado(int caras) {
        if (caras < 1) {
            throw new IllegalArgumentException("Las caras del dado deben ser mayores que 0: " + caras);
        }
        return random.nextInt(caras) + 1;
    }

    public int numeroAleatorio(int limite) {
        if (limite < 1) {
            throw new IllegalArgumentException("El límite debe ser mayor que 0: " + limite);
        }
        return random.nextInt(limite);
    }

}
