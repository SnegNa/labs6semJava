package lab5.Factory;

import lab5.Polo;
import lab5.GasolineI;
import lab5.Rio;

import java.util.ArrayList;
import java.util.Random;


public class GasolineFactory {

    public GasolineI getCar(String carName){
        Random random = new Random();
        if (carName == null){
            return null;
        }
        if (carName.equalsIgnoreCase("Polo")) {
            return new Polo(getRandomColor(), random.nextInt(17000),random.nextInt(4),random.nextInt(2)*2+4
                    ,random.nextInt(23)+80);
        } else if(carName.equalsIgnoreCase("Rio")){
            return new Rio(getRandomColor(), random.nextInt(17000),random.nextInt(4)+2,random.nextInt(2)*2+4
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
