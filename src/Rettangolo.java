public class Rettangolo extends Forma{
    public Rettangolo(int base, int altezza){
        super(base, altezza);
    }

    @Override
    public int calcolaArea() {
        return 0;
    }

    public int calcolaArea(int base, int altezza){

        return base * altezza;
    }

    @Override
    public String toString() {
        return "Rettangolo{}";
    }
}
