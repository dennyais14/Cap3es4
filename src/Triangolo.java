public class Triangolo extends Forma{

    public Triangolo(int base, int altezza){
        super(base, altezza);
    }
    @Override
    public int calcolaArea() {
        return 0;
    }
    public int calcolaArea(int base, int altezza){

        return (base * altezza)/2;
    }

}
