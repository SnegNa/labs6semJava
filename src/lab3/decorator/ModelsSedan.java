package lab3.decorator;

import lab3.Model_S;

public class ModelsSedan implements Description {
    private final Model_S model_sS;

    public ModelsSedan(Model_S model_sS) {
        this.model_sS = model_sS;
    }

    @Override
    public String getDescription() {
        return this.model_sS.getDescription() + " Сar body is sedan";
    }
}



