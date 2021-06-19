public class Motorcycle {
    private int price;
    private String model;
    private String manufacturerMoto;
    private double capacity;
    private int productionYear;
    private char size;

    public Motorcycle(String manufacturerMoto, int price, String model, double capacity, int productionYear, char size) {
        this.manufacturerMoto = manufacturerMoto;
        this.price = price;
        this.model = model;
        this.capacity = capacity;
        this.productionYear = productionYear;
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public String getManufacturerMoto() {
        return manufacturerMoto;
    }

    public void setManufacturerMoto(String manufacturerMoto) {
        this.manufacturerMoto = manufacturerMoto;
    }

    public void printMotorcycleInfo() {
        System.out.println("Dane motocykla marki "+manufacturerMoto+".");
        System.out.println("Model to: "+this.model);
        System.out.println("Pojemność silnika to: "+this.capacity);
        System.out.println("Rok produkcji to: "+this.productionYear);
        System.out.println("Cena to: "+this.price);
    }

    public boolean priceBMWUpgrade() {
        if (this.manufacturerMoto == "BMW") {
            this.price += 5000;
            return true;
        }
        else
        {
            return false;
        }
    }
}
