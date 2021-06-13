public class Car {
    public String color;
    public String model;
    public String manufacturer;
    public String makeYear;
    public String fuelType;

            public Car() {
            }
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

            public void StartEngine() {
                System.out.println("Silnik "+ this.manufacturer + " " + this.model +" został uruchomiony.");
            }

            public void StopEngine() {
                System.out.println("Silnik "+ this.manufacturer + " " + this.model +" został zwolniony o ");
            }
}
