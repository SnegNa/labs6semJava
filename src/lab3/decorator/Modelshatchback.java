package lab3.decorator;

import lab3.Model_S;

public class Modelshatchback implements Description {
    private final Model_S model_sH;

    public Modelshatchback(Model_S model_sH) {
        this.model_sH = model_sH;
    }

    @Override
    public String getDescription() {
        return this.model_sH.getDescription() + " Сar body is hatchback";
    }
}


