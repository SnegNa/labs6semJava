package lab3;

import java.util.ArrayList;
import java.util.Random;
import lab3.decorator.*;
/*
С помощью декораторов расширяю метод getDescription(), добавил вид кузова автомобиля. Для каждого авто создал пару
вариантов кузова.
*/
public class Main {
    public static void main(String[] args) {
        showCars(randomCar(10));
    }
    public static  ArrayList<Description> randomCar(int n){
        Random random = new Random();
        ArrayList<Description> carArrray = new ArrayList<>();
        Model_S model_s;
        Polo polo;
        Vision vision;
        Rio rio;
        for (int i = 0; i < n; i++) {
            switch (random.nextInt(4)){
                case 0 -> { model_s = new Model_S(getRandomColor(), random.nextInt(17000),random.nextInt(10),random.nextInt(5)
                ,random.nextInt(23)+80);
                carArrray.add((random.nextInt(2) == 0 ? new Modelshatchback(model_s) : new ModelsSedan(model_s) ) );
                }
                case 1 -> {vision = new Vision(getRandomColor(), random.nextInt(17000),random.nextInt(10),random.nextInt(5)
                        ,random.nextInt(23)+80);
                carArrray.add(random.nextInt(2) == 0 ? new VisionSedan(vision) : new VisionUneversal(vision));
                }
                case 2 -> {rio = new Rio(getRandomColor(), random.nextInt(17000),random.nextInt(4)+2,random.nextInt(2)*2+4
                        ,random.nextInt(23)+80);
                carArrray.add(random.nextInt(2) == 0 ? new RioCrossover(rio) : new RioHatchback(rio));}
                case 3 -> {polo = new Polo(getRandomColor(), random.nextInt(17000),random.nextInt(4),random.nextInt(2)*2+4
                        ,random.nextInt(23)+80);
                    carArrray.add(random.nextInt(2) == 0 ? new PoloSedan(polo) : new PoloUniversal(polo));
                }

            }


        }
        return carArrray;
    }

    public static void showCars(ArrayList<Description> carArray){
        for (Description description : carArray) {
            System.out.println(description.getDescription());
        }
    }
    public static String getRandomColor(){
        String[]  arr = new String[] {"green","blue","gray space","bordo","deep blue","yellow"};
        Random random = new Random();
        return arr[random.nextInt(6)];

    }


}
