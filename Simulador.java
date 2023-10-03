public class Simulador {
    private static final int DURACAO = 60;
    private static final int INTERVALO = 5;

    public static void main(String[] args) {
        System.out.println("Simulador de Animais\n");

        Animal[] animais = new Animal[3];
        animais[0] = new FalcaoPeregrino();
        animais[1] = new Guepardo();
        animais[2] = new PeixeAgulhao();

        for (int t = INTERVALO; t <= DURACAO; t += INTERVALO) {
            for (Animal animal : animais){
                System.out.printf("t = %d%n", t);
                animal.mover(INTERVALO);
                animal.mover(INTERVALO);
                animal.mover(INTERVALO);

                System.out.println();
            }
        }
    }
} // fim da classe Simulador