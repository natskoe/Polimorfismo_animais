public class FalcaoPeregrino extends Animal {
    private static final int VELOCIDADE_KMH = 390;
    
    public FalcaoPeregrino(){
        somarMetrosPercorridos(0);
    }
    @Override
    public void mover(int segundos) {
        if (segundos > 0) {
            somarMetrosPercorridos(VELOCIDADE_KMH * 1000 / 3600 * segundos);
            System.out.printf("O falcão peregrino voou %.1f metros.%n",
			      getMetrosPercorridos());
        }
    }
} // fim da classe FalcaoPeregrino