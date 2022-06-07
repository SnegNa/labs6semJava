package lab5;

import lab5.Factory.ElectricFactory;
import lab5.Factory.GasolineFactory;

/*
Для данной работы создал два фабричных метода. Первый для бензиновых машин, второй для электрокаров.
Интерфейсы данных классов содержат методы предназначенные для вывода описания созданных обьектов
Поля обьектов заполняю случайно
*/

public class Main {

    public static void main(String[] args) {
        ElectricFactory electricfactory = new ElectricFactory();
        ElectricI el1 = electricfactory.getCar("Model_S");
        ElectricI el2 = electricfactory.getCar("Vision");


        GasolineFactory gasolinefactory = new GasolineFactory();
        GasolineI gas1 = gasolinefactory.getCar("Polo");
        GasolineI gas2 = gasolinefactory.getCar("Rio");

        System.out.println(el1.getDescriptionElectric());
        System.out.println(el2.getDescriptionElectric());

        System.out.println(gas1.getDescriptionGasoline());
        System.out.println(gas2.getDescriptionGasoline());

    }

}
