public class StringiDemo {
    public static void main(String[] args) {
        String name = "Euzebiusz";

        int dlugosc = name.length();

        char inicjal = name.charAt(5);

        System.out.println("Znak: " + inicjal);

        String male, duze;
        male = name.toLowerCase();
        duze = name.toUpperCase();

        System.out.println(name +", " +male + ", " + duze);

    }
}
