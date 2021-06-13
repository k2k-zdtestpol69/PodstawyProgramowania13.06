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

//        String text = " Duke Nukem Forever ";
//        String text2 = new String("Olga2");
//        String text3 = "Olga3";
//        System.out.println(text.length());
//        System.out.println(text.indexOf('g'));
//        System.out.println(text.substring(3,7));
//        System.out.println(text.trim());
//        text.toCharArray();

        int a;
        int b;
        a = 10;
        b = 50;
        int suma = a+b;
        int roznica = a-b;
        float mnozenie = a*b;
        double dzielenie = a/b;
        int modulo = a%b;
        System.out.println("Wartość a to "+a);
        System.out.println("Wartość b to "+b);
        System.out.println("Suma a i b to: "+ suma);
        System.out.println("Roznica a i b to: "+ roznica);
        System.out.println("Mnozenie a i b daje: "+ mnozenie);
        System.out.println("Dzielenie a i b daje: "+ dzielenie);
        System.out.println("Reszta z dzielenia a i b daje: " +modulo);
    }
}
