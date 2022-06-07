package lab3.decorator;

import lab3.Model_S;
import lab3.Vision;

public class VisionSedan implements Description{
    private final Vision visionS;

    public VisionSedan(Vision visionS) {
        this.visionS = visionS;
    }

    @Override
    public String getDescription() {
        return this.visionS.getDescription() + " Сar body is sedan";
    }
}



