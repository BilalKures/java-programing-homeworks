
public class test {
    // Değişkenleri tanımlayın
    private static final float EARTH_GRAVITY = 9.81f;
    private static final float MARS_GRAVITY = 3.71f;
    private static float earthWeightKuresb = 70.0f;
    private static float marsWeightKuresb;
    private static double marsWeightDoubleKuresb;
    private static int marsWeightIntKuresb;
    private static char marsWeightCharKuresb;

    public static void main(String[] args) {
        // Mars'ta ağırlık hesapla
        marsWeightKuresb = earthWeightKuresb * (MARS_GRAVITY / EARTH_GRAVITY);
        System.out.println("Weight on Mars: " + String.format("%.4f", marsWeightKuresb));

        // Double'ı int'e dönüştür
        marsWeightDoubleKuresb = marsWeightKuresb;
        marsWeightIntKuresb = (int) marsWeightDoubleKuresb;
        System.out.println("Weight on Mars as int: " + marsWeightIntKuresb);

        // Int'i char'a dönüştür
        marsWeightCharKuresb = (char) marsWeightIntKuresb;
        System.out.println("Weight on Mars as char: " + marsWeightCharKuresb);

        // Char üzerinde matematiksel işlem yap ve int'e ata
        int charMath = marsWeightCharKuresb + 10;
        System.out.println("Char math result: " + charMath);
    }
}
