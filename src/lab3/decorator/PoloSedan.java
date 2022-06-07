package lab3.decorator;


import lab3.Polo;

public class PoloSedan implements Description {
    private final Polo poloS;

    public PoloSedan(Polo poloS) {
        this.poloS = poloS;
    }

    @Override
    public String getDescription() {
        return this.poloS.getDescription() + " Сar body is sedan";
    }
}



