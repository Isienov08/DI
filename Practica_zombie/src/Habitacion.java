public class Habitacion {
    /*
    se almacena: el numero de la habitacion, los intentos de busqueda, los zombies,...
    cuando avanzas a una nueva habitacion, como sabes cuantos zombies hay
        el enunciado fija una regla: toda habitación nueva empieza con 1 zombie y 3 intentos de búsqueda
     */
    private int numeroHabitacion;
    private int intentosBusqueda;
    private int numZombies;

    public Habitacion(int numeroHabitacion) {
        this.numeroHabitacion = Math.max(1,numeroHabitacion);
        this.intentosBusqueda = 3;
        this.numZombies = 1;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }
    public int getIntentosBusqueda() {
        return intentosBusqueda;
    }
    public int getNumZombies() {
        return numZombies;
    }

    public void gastarIntentoBusqueda() {
        this.intentosBusqueda = Math.max(0, this.intentosBusqueda - 1);
    }
    public boolean quedanIntentosBusqueda() {
        return this.intentosBusqueda > 0;
    }
    public void eliminarZombie() {
        this.numZombies = Math.max(0, this.numZombies - 1);
    }
    public void anadirZombies(int cantidad) {
        if (cantidad > 0) {
            this.numZombies += cantidad;
        }
    }
    public boolean hayZombies() {
        return this.numZombies > 0;
    }
}
