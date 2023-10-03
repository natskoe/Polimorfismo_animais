public class Guepardo extends Animal{
    private static final int VELOCIDADE_KMH = 130;

    public Guepardo(){
        somarMetrosPercorridos(0);
    }
    @Override
    public void mover(int segundos) {
        if (segundos > 0) {
            somarMetrosPercorridos(VELOCIDADE_KMH * 1000 / 3600 * segundos);
            System.out.printf("O guepardo voou %.1f metros.%n",
			      getMetrosPercorridos());
        }
    }
} // fim da classe Guepardo
