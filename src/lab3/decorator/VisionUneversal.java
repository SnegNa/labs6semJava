package lab3.decorator;

import lab3.Model_S;
import lab3.Vision;

public class VisionUneversal implements Description {
    private final Vision visionU ;

    public VisionUneversal(Vision visionU) {
        this.visionU = visionU;
    }

    @Override
    public String getDescription() {
        return this.visionU.getDescription() + " Сar body is universal";
    }
}



