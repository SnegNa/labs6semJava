package lab3.decorator;

import lab3.Model_S;
import lab3.Rio;

public class RioHatchback implements Description{
    private final Rio rioH;

    public RioHatchback(Rio rioH) {
        this.rioH = rioH;
    }

    @Override
    public String getDescription() {
        return this.rioH.getDescription() + " Сar body is hatchback";
    }
}


