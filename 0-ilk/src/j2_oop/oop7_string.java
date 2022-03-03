package j2_oop;

public class oop7_string {
    public static void main(String[] args) {
        String isim = " Özgür Tokay ";

        System.out.println(isim.length());
        System.out.println(isim.charAt(2));
        System.out.println(isim.concat(" tokay"));
        System.out.println(isim.toUpperCase());
        System.out.println(isim.toLowerCase());
        System.out.println(isim.trim());

        String ay1 = "ocak";
        String ay2 = "şubat";
        System.out.println(ay1.equals(ay2));

        ay2 = "Ocak";
        System.out.println(ay1.equals(ay2));
        System.out.println(ay1.equalsIgnoreCase(ay2));

        System.out.println(ay1.startsWith("o"));
        System.out.println(ay1.contains("k"));
    }
}
