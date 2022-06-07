package lab3.decorator;

import lab3.Model_S;
import lab3.Rio;

public class RioCrossover implements Description{
    private final Rio rioC;

    public RioCrossover(Rio rioC) {
        this.rioC = rioC;
    }

    @Override
    public String getDescription() {
        return this.rioC.getDescription() + " Сar body is crossover";
    }
}


