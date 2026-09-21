public abstract class Personaje {
    private int vidaActual;
    private int ataque;

    public Personaje(int vidaActual, int ataque) {
        this.vidaActual = vidaActual;
        this.ataque = ataque;
    }

    public int getVidaActual() {
        return vidaActual;
    }

    public void setVidaActual(int vidaActual) {
        this.vidaActual = vidaActual;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }


    public boolean estaVivo (){
        if (this.vidaActual<0){
            this.vidaActual=0;
        }

        if (vidaActual == 0) {
            return false;
        } else {
            return true;
        }
    }

    public abstract int ataca();

    public void daño(int ataqueTurno){
        this.vidaActual=vidaActual-ataqueTurno;

        if (this.vidaActual<0){
            this.vidaActual=0;
        }

    }

}
