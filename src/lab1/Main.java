package lab1;


import java.util.ArrayList;
import java.util.Random;

//Предметная область - автомобили. Класc Car базовый , далее разделения на электро кары и бензиновые авто.

public class Main {
    public static void main(String[] args) {
        showCars(randomCar(10));
    }
    public static  ArrayList<Car> randomCar(int n){
        Random random = new Random();
        ArrayList<Car> carArrray = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            switch (random.nextInt(4)){
                case 0 -> carArrray.add(new Model_S(getRandomColor(), random.nextInt(17000),random.nextInt(10),random.nextInt(5)
                ,random.nextInt(23)+80));
                case 1 -> carArrray.add(new Vision(getRandomColor(), random.nextInt(17000),random.nextInt(10),random.nextInt(5)
                        ,random.nextInt(23)+80));
                case 2 -> carArrray.add(new Rio(getRandomColor(), random.nextInt(17000),random.nextInt(4)+2,random.nextInt(2)*2+4
                        ,random.nextInt(23)+80));
                case 3 -> carArrray.add(new Polo(getRandomColor(), random.nextInt(17000),random.nextInt(4),random.nextInt(2)*2+4
                        ,random.nextInt(23)+80));

            }


        }
        return carArrray;
    }

    public static void showCars(ArrayList<Car> carArray){
        for (Car car : carArray) {
            System.out.println(car.getDescription());
        }
    }
    public static String getRandomColor(){
        String[]  arr = new String[] {"green","blue","gray space","bordo","deep blue","yellow"};
        Random random = new Random();
        return arr[random.nextInt(6)];

    }


}
