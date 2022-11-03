public class Zmienne {
    public static void main(String[] args) {

        int liczba1;
        liczba1 =123;

        double liczba2 = 23.9;


        System.out.println("Moja zmienna: " + liczba1);

        liczba1 = (int)liczba2;

        System.out.println(liczba1);

        int hours = 8;
        int days = 5;
        int weeks = 52;

        //komentarz
        int workHoursPerYear2 = hours * days * weeks;

        System.out.println(workHoursPerYear2);

        String napis = "Dzisiaj\n jest piękna \"pogoda\"";

        System.out.println("Mój\t napis: " + napis + workHoursPerYear2);
        System.out.print("Mój \nnapis: " + napis +
                workHoursPerYear2 + "\n");
        System.out.print("Mój napis: " + napis + workHoursPerYear2);

        char znak = '#';

        boolean slonce = false; //true




    }
}
