public class Superviviente extends Personaje{
    public static final int vidaMax=20;
    private int botiquin;
    private int armas;
    private int protecciones;

    public Superviviente() {
        super(20,4);
        this.botiquin = 0;
        this.armas = 0;
        this.protecciones = 0;
    }

    public int getBotiquin() {
        return botiquin;
    }
    public void setBotiquin(int botiquin) {
        this.botiquin = botiquin;
    }

    public int getArmas() {
        return armas;
    }
    public void setArmas(int armas) {
        this.armas = armas;
    }

    public int getProtecciones() {
        return protecciones;
    }
    public void setProtecciones(int protecciones) {
        this.protecciones = protecciones;
    }

    @Override
    public String toString() {
        return "--- DATOS DEL SUPERVIVIENTE ---\n" +
                "Vida: " + getVidaActual() + "/" + vidaMax + "\n" +
                "Ataque base: " + getAtaque() + "\n" +
                "Armas: " + armas + "\n" +
                "Protecciones: " + protecciones + "\n" +
                "Botiquín: " + botiquin;
    }

    @Override
    public int ataca() {
        return 0;
    }


}
