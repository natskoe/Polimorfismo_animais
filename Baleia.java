public class Baleia extends Mamifero implements Conversacao{

    private static final int VELOCIDADE_KMH = 47;

    @Override
    public void mover(int segundos){
        if (segundos > 0) {
            somarMetrosPercorridos(VELOCIDADE_KMH * 1000 / 3600 * segundos);
            System.out.printf("A baleia nadou %.1f metros.%n",
			      getMetrosPercorridos());
        }
    }

    @Override
    public void falar(){
        System.out.println("Booooaaaa Noiiiiteee");
    }
    
}
