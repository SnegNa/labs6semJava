package lab5.Factory;

import lab5.ElectricI;
import lab5.Vision;
import lab5.Model_S;

import java.util.ArrayList;
import java.util.Random;

public class ElectricFactory {
    public ElectricI getCar(String carName) {
        Random random = new Random();
        if (carName == null){
            return null;
        }
        if (carName.equalsIgnoreCase("Vision")) {
            return new Vision(getRandomColor(), random.nextInt(17000),random.nextInt(10),random.nextInt(5)
                    ,random.nextInt(23)+80);
        } else if(carName.equalsIgnoreCase("Model_S")){
            return new Model_S(getRandomColor(), random.nextInt(17000),random.nextInt(10),random.nextInt(5)
                    ,random.nextInt(23)+80);
        }
        return null;
    }

    public static String getRandomColor(){
        String[]  arr = new String[] {"green","blue","gray space","bordo","deep blue","yellow"};
        Random random = new Random();
        return arr[random.nextInt(6)];

    }
}
