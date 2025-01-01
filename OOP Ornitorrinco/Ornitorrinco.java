public class Ornitorrinco extends Mamifero implements Anfibio, Oviparo, Venenoso {

    private int huevos;

    public Ornitorrinco(int huevos) {
        this.huevos = huevos;
    }

    public void envenenar() {
        System.out.println("te envenene");
    }

    public void colocarHuevos() {
        System.out.println("he puesto " + huevos + " huevos");
    }

    public void respirarBajoAgua() {
        System.out.println("respiro bajo el agua");
    }

    public int getHuevos() {
        return huevos;
    }

    public void setHuevos(int huevos) {
        this.huevos = huevos;
    }

}
