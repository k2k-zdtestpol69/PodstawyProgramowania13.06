import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        System.out.println("Cześć Adam");
//
//          ** Constructing Cars
//        Car Opel = new Car();
//        Car Kia = new Car("Kia","ceed","srebrny","2018","petrol");
//
//        Kia.StartEngine();
//
//        Kia.StopEngine(100);

//          ** How to make interpreters ommit
//
//        System.out.println("Cześć Adam\tblablabla");
//        System.out.println("Cześć Adam\nnowa linia hehehe");
//        System.out.println("Cześć Adam \"interpreter omija\"");
//        // komentarzyk blablabla niewidoczny dla IntelliJ
//
//        Opel.StartEngine();


        /*Chars And Strings*/
//        String text = "Podstawy programowania JAVA";
//        char Znaczek = 'p';
//        char Alpha = '\u03b1';
//
//        System.out.println(text);
//
//        System.out.println(Character.isDigit(Znaczek));
//        System.out.println(Alpha);

        String text = " Duke Nukem Forever ";
        String text2 = new String("Olga2");
        String text3 = "Olga3";
        System.out.println(text.length());
        System.out.println(text.indexOf('g'));
        System.out.println(text.substring(3,7));
        System.out.println(text.trim());
        text.toCharArray();
    }
}
