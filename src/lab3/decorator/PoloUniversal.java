package lab3.decorator;


import lab3.Polo;

public class PoloUniversal implements Description {
    private final Polo poloU;

    public PoloUniversal(Polo poloU) {
        this.poloU= poloU;
    }


    @Override
    public String getDescription() {
        return this.poloU.getDescription() + " Сar body is universal";
    }
}



