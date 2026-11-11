public class Superviviente extends Personaje {
    /*
    ● X Número máximo de puntos de vida (20).
        -q no se pueda pasar de 20 en ninguna circustancia (si por lo que sea se pasa controlar con ena excepcion)
    ● X Puntos de vida actuales (20).
    ● X Puntos de ataque (4).
        -nunca se inicie un superviviente con diferente ataque a 4
        -nunca varie siempre 4
    ● X Lleva botiquín (No).
        -no son acumulables por lo que deben de ser max 1 min 0
        -cura 4 puntos de vida
    ● X Cantidad de armas (0).
        -acumulables min 0
        -cada arma +1 en ataque
    ● X Cantidad de protecciones (0)
        -acumulable min 0
        -cada proteccion daño -1

    X ataque del superviviente
        -lanzo el dado de numero de caras igual al ataque+armas
    X recibir daño
        -recibe el ataque (parametro)
        -por cada proteccion 1-daño
     */

    public static final int VIDA_MAX = 20;
    public static final int ATAQUE_BASE = 4;
    private static final int CURACION_BOTIQUIN = 4;
    private boolean botiquin;
    private int armas;
    private int protecciones;

    public Superviviente() {
        super(VIDA_MAX, ATAQUE_BASE);
        this.botiquin = false;
        this.armas = 0;
        this.protecciones = 0;
    }


    public boolean isBotiquin() {
        return botiquin;
    }

    public boolean recogerBotiquin() {
        /* false si ya tenía uno */
        if (isBotiquin()) {
            return false;
        } else {
            this.botiquin=true;
            return true;
        }
    }

    public boolean usarBotiquin() {
        /* cura 4 con tope en VIDA_MAX y consume el botiquín */
        if (isBotiquin()) {
            setVidaActual(Math.min(VIDA_MAX, getVidaActual() + CURACION_BOTIQUIN));
            this.botiquin = false;
            return true;
        } else {
            return false;
        }
    }


    public int getArmas() {
        return armas;
    }
    public void anadirArma() {
        this.armas++;
    }


    public int getProtecciones() {
        return protecciones;
    }
    public void anadirProteccion() {
        this.protecciones++;
    }


    @Override
    public void recibirDanio(int ataqueTurno) {
        int danio = Math.max(0, ataqueTurno - protecciones);
        setVidaActual(getVidaActual() - danio);
    }

    @Override
    public int ataca(GestorDados dados) {
        int ataque = getAtaque() + this.armas;
        return dados.tirarDado(ataque);
    }

    @Override
    public String toString() {
        return "--- DATOS DEL SUPERVIVIENTE ---\n" +
                "Vida: " + getVidaActual() + "/" + VIDA_MAX + "\n" +
                "Ataque base: " + getAtaque() + "\n" +
                "Armas: " + armas + "\n" +
                "Protecciones: " + protecciones + "\n" +
                "Botiquín: " + botiquin;
    }
}
