public class Animal {

    //VELOCIDADE_KMH * 1000 / 3600 * segundos -> Calcula os metros percorridos.

    private double metrosPercorridos;

    public Animal() {
        this.metrosPercorridos = 0;
    }

    public double getMetrosPercorridos() {
        return this.metrosPercorridos;
    }

    public void somarMetrosPercorridos(double metrosPercorridos) {
        this.metrosPercorridos += metrosPercorridos;
    }

    public void mover(int segundos) {}
}


