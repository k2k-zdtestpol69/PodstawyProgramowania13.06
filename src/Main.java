public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Cześć Adam");

        Car Opel = new Car();
        Car Kia = new Car("Kia","ceed","srebrny","2018","petrol");

        Kia.StartEngine();

        Kia.StopEngine(100);

        Opel.StartEngine();

    }
}
