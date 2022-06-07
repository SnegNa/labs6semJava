package lab6;
import lab6.Factory.*;

/*
FN-Factory New. Разделил машины на прямо с завода и поддрежанные.
при значение  FN получим новые авто
при значение Used поддержаные
*/
public class Main {

    public static void main(String[] args) {
String typeOf = "Used";
        carFactory carF = getCarFactory(typeOf);

        Model_S_I model_s = carF.getModel_S();
        Vision_I vision = carF.getVision();
        Polo_I polo = carF.getPolo();
        Rio_I rio = carF.getRio();

        System.out.println(model_s.getDescription());
        System.out.println(vision.getDescription());
        System.out.println(polo.getDescription());
        System.out.println(rio.getDescription());

    }

    public static carFactory getCarFactory(String factoryName) {
        if (factoryName == null) {
            return null;
        }
        if (factoryName.equalsIgnoreCase("FN")) {
            return new fnFactory();
        } else if (factoryName.equalsIgnoreCase("Used")) {
            return new usedFactory();
        }
        return null;
    }

}
