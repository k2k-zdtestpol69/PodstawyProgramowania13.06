import javax.swing.*;
import java.sql.SQLOutput;

public class Car {
            public String color;
            public String model;
            public String manufacturer;
            public String makeYear;
            public String fuelType;
            public boolean engine = true;
            public int engineCapacity;
            public double tyrePressure;
            public int doorNumber;


            public Car() {}

            public Car(String manufacturer, String model, String color, String makeYear, String fuelType) {
                this.model = model;
                this.makeYear = makeYear;
                this.manufacturer = manufacturer;
                this.fuelType = fuelType;
                this.color = color;
            }

            public Car(String color, String model, String fuelType) {
                this.color = color;
                this.model = model;
                this.fuelType = fuelType;
            }

            public Car(int engineCapacity, double tyrePressure, int doorNumber) {
                this.engineCapacity = engineCapacity;
                this.tyrePressure = tyrePressure;
                this.doorNumber = doorNumber;
            }

    public void StartEngine() {
        engine = true;
        System.out.println("Silnik "+ this.manufacturer + " " + this.model +" został uruchomiony.");
    }


    /**
     *
     * @param percentageOfEngine parametr ustawiający pracę silnika, wartości w integer
     */
    public void StopEngine(int percentageOfEngine) {
                System.out.println("Silnik "+ this.manufacturer + " " + this.model +" został zwolniony o " + percentageOfEngine + "%.");
                    if (percentageOfEngine == 100) {
                        engine = false;
                        System.out.println("Silnik został zatrzymany całkowicie!");
                    }
            }

    public void calculateMaximumSpeed() {
        System.out.println(this.doorNumber*this.engineCapacity/this.tyrePressure);
    }
}
