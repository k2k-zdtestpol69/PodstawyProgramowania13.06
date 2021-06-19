import javax.swing.*;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Car extends Vehicle {
            public String color;
            public String model;
            public String manufacturer;
            public int makeYear;
            public String fuelType;
            public boolean engine = true;
            public int engineCapacity;
            public double tyrePressure;
            public int doorNumber;


            public Car() {}

            public Car(String manufacturer, String model, String color, int makeYear, String fuelType) {
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

    public void checkIfFrom2000(){
        if (this.makeYear > 2000) {
            System.out.println("Skoro jest nowszy od 2000 roku to kupuję.");
        }
        else
        {
            System.out.println("Takich badziewi starych to ja nie kupię.");
        }
    }

    public void checkIfListIsEmpty(ArrayList<Car> tableParam){
        System.out.println(tableParam.isEmpty());
        }
}

