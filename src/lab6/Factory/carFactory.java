package lab6.Factory;


import lab6.*;

public interface carFactory {
    Model_S_I getModel_S();
    Vision_I getVision();
    Polo_I getPolo();
    Rio_I getRio();

}
