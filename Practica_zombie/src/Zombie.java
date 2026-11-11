public class Zombie extends Personaje {
    /*
    - es bueno que el constructor dependa de un objeto dados, y si si es incorrecto el enfoque, porque.
    - para gestionar el numero de habitaciones para la formula. Con la formulo ya hacemos depender esta clase del numero de habitaciones. Opciones:
            Q haya una clase habitacion donde se almacene: el numero de la habitacion, el max de habtaciones, los intentos de busqueda,..

     RESPUESTA: Zombie solo recibe vida y ataque ya calculados. Quien tira los dados es la partida, usando GestorDados.
        Partida → Habitacion, GestorDados, Zombie, Superviviente
        Zombie  → (solo Personaje)
     */

    public Zombie(int vidaActual, int ataque) {
        super(vidaActual, ataque);
    }

    @Override
    public void recibirDanio(int ataqueTurno){
        setVidaActual(Math.max(0, getVidaActual()-ataqueTurno));
    }

    @Override
    public int ataca(GestorDados dados) {
        return dados.tirarDado(getAtaque());
    }
}
