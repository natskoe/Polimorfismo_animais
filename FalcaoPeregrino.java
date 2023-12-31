public class FalcaoPeregrino extends Mamifero implements Conversacao {
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

    @Override
    public void falar(){
        System.out.println("Uaaaaar minhoca uaaar");
    }

} // fim da classe FalcaoPeregrino