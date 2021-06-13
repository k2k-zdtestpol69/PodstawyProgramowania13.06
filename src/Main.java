import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
//          ** Constructing Cars
        Car Opel = new Car();
        Car Kia = new Car("Kia","ceed","srebrny",2018,"petrol");
        Car Polonez = new Car(80, 2.0, 5);
        Car Polonez2 = new Car("FSO","Polonez","różowy",1980,"uranium");

//        Kia.StartEngine();
//
//        Kia.StopEngine(100);


//        Polonez.calculateMaximumSpeed();
        System.out.println("Rok produkcji "+Polonez2.manufacturer +" to "+Polonez2.makeYear);
        Polonez2.checkIfFrom2000();

        System.out.println("Rok produkcji "+ Kia.manufacturer + " to " + Kia.makeYear);
        Kia.checkIfFrom2000();


    }
}
