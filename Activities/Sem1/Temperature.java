public class Temperature {
    static final double FREEZING_POINT = 32.0;
    static double temperature = 36.5;
    static boolean isFreezing = (temperature < FREEZING_POINT);

    public static void main(String[] args) {
        if (isFreezing) System.out.println("It's freezing!");
        else System.out.println("Above freezing.");
    }
}