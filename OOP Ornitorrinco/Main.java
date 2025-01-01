public class Main {
    public static void main(String[] args) {

        int count = 1;

        Ornitorrinco orn1 = new Ornitorrinco(count++);

        orn1.colocarHuevos();

        orn1.envenenar();

        orn1.respirarBajoAgua();

        orn1.amamantar();

        Ornitorrinco orn2 = new Ornitorrinco(count++);

        orn2.colocarHuevos();

        Ornitorrinco orn3 = new Ornitorrinco(count++);

        orn3.colocarHuevos();

    }
}
