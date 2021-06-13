import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
//          ** Constructing Cars
        Car Opel = new Car();
        Car Kia = new Car("Kia","ceed","srebrny","2018","petrol");
        Car Polonez = new Car(80, 2.0, 5);


//        Kia.StartEngine();
//
//        Kia.StopEngine(100);

        Polonez.calculateMaximumSpeed();

    }
}
