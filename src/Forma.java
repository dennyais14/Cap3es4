public abstract class Forma {
    private final int base;
    private final int altezza;

    public Forma(int base, int altezza){
        this.base = base;
        this.altezza = altezza;
    }

    public int getBase() {
        return base;
    }

    public int getAltezza() {
        return altezza;
    }

    public abstract int calcolaArea();
}
