public abstract class Personaje {
    private int vidaActual;
    private final int ataque;

    public Personaje(int vidaActual, int ataque) {
        this.vidaActual = vidaActual;
        this.ataque = ataque;
    }

    public int getVidaActual() {
        return vidaActual;
    }

    public void setVidaActual(int vidaActual) {
        this.vidaActual = Math.max(0, vidaActual);
    }

    public int getAtaque() {
        return ataque;
    }

    public boolean estaVivo() {
        return vidaActual > 0;
    }

    public abstract int ataca(GestorDados dados);

    public abstract void recibirDanio(int tiradaAtaqueRival);

}
