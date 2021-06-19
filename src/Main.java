import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//          ** Constructing Cars
        Car Opel = new Car();
        Car Kia = new Car("Kia", "ceed", "srebrny", 2018, "petrol");
        Car Polonez = new Car(80, 2.0, 5);
        Car Polonez2 = new Car("FSO", "Polonez", "różowy", 1980, "uranium");
        Car Toyota = new Car("Toyota", "Prius", "niebieski", 2010, "petrol");
        Car Mazda = new Car("Mazda", "CX3", "czarny", 2020, "diesel");

//        Kia.StartEngine();
//
//        Kia.StopEngine(100);


//        Polonez.calculateMaximumSpeed();
//        System.out.println("Rok produkcji "+Polonez2.manufacturer +" to "+Polonez2.makeYear);
//        Polonez2.checkIfFrom2000();
//
//        System.out.println("Rok produkcji "+ Kia.manufacturer + " to " + Kia.makeYear);
//        Kia.checkIfFrom2000();

        Motorcycle Jawa = new Motorcycle("Jawa", 3000, "350", 0.350, 1970, 'S');
//        Jawa.getPrice();
//        Jawa.setPrice(4100);
//        Jawa.getPrice();
//        Jawa.printMotorcycleInfo();
//        Jawa.setManufacturerMoto("BMW");
//        Jawa.priceBMWUpgrade();
//        Jawa.getPrice();
//        Jawa.motorcycleInRangePrintOut();

//        Jawa.changeCurrencyToUSD(4.5);
//        Jawa.getPrice();

//        ArrayList<Car> CarsTable = new ArrayList<>();
//        CarsTable.add(Toyota);
//        CarsTable.add(Kia);
//        CarsTable.add(Polonez2);
//        CarsTable.add(Mazda);
//        CarsTable.add(Polonez);
//        CarsTable.remove(0);
//
//        CarsTable.get(2);
//        CarsTable.clear();
//        CarsTable.isEmpty();
        Vehicle pojazdy = new Vehicle();
//        pojazdy.tableChecker(CarsTable);
        Mechanic serwisant1 = new Mechanic("Stefan", "Blacharski", 3000, "blacharz");
        Accountant ksiegowa1 = new Accountant("Lidia", "Rachmistrz", 4000, 4);

        Motorcycle Kawasaki = new Motorcycle("Kawasaki", 4000, "ZX", 0.6, 1991, 'S');
        Motorcycle Suzuki = new Motorcycle("Suzuki", 6000, "GS", 0.5, 2004, 'S');
        Motorcycle Honda = new Motorcycle("Honda", 9000, "CBR", 0.125, 2007, 'M' );

        ArrayList<Motorcycle> motorcyclesTable = new ArrayList<>();

        motorcyclesTable.add(Kawasaki);
        motorcyclesTable.add(Suzuki);
        motorcyclesTable.add(Honda);
        pojazdy.motorcycleCheck(motorcyclesTable);

    }
}
