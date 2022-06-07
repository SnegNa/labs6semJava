package lab6.Factory;

import lab6.Model_S_I;
import lab6.Polo_I;
import lab6.Rio_I;
import lab6.Vision_I;
import lab6.used.*;


import java.util.Random;

public class usedFactory implements carFactory {
    Random random = new Random();
    @Override
    public Model_S_I getModel_S(){
        return new usedModel_S(getRandomColor(), random.nextInt(17000),random.nextInt(10),random.nextInt(5)
                ,random.nextInt(23)+80);
    }
    @Override
    public Vision_I getVision(){
        return new usedVision(getRandomColor(), random.nextInt(17000),random.nextInt(10),random.nextInt(5)
                ,random.nextInt(23)+80);
    }
    @Override
    public Polo_I getPolo(){
        return new usedPolo(getRandomColor(), random.nextInt(17000),random.nextInt(4),random.nextInt(2)*2+4
                ,random.nextInt(23)+80);
    }
    @Override
    public Rio_I getRio(){
        return new usedRio(getRandomColor(), random.nextInt(17000),random.nextInt(4)+2,random.nextInt(2)*2+4
                ,random.nextInt(23)+80);
    }
    public static String getRandomColor(){
        String[]  arr = new String[] {"green","blue","gray space","bordo","deep blue","yellow"};
        Random random = new Random();
        return arr[random.nextInt(6)];

    }
}
