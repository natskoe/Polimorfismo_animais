public class PeixeAgulhao extends Mamifero implements Conversacao {
    private static final int VELOCIDADE_KMH = 115;

    public PeixeAgulhao(){
        somarMetrosPercorridos(0);
    }
    @Override
    public void mover(int segundos) {
        if (segundos > 0) {
            somarMetrosPercorridos(VELOCIDADE_KMH * 1000 / 3600 * segundos);
            System.out.printf("O peixe-agulhao nadou %.1f metros.%n",
			      getMetrosPercorridos());
        }
    }
    @Override
    public void falar(){
        System.out.println("Proooocuraaando Neeemooo");
    }
} // fim da classe PeixeAgulhao