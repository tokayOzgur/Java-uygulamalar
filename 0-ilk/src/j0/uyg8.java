package j0;

public class uyg8 {
    // çarpım tablosu oluşturma
    public static void main(String[] args) {
        // Your code
        String sonuc = "*********Çarpım Tablosu";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                sonuc += "\n" + i + " * " + j + " = " + (i * j);
            }
            sonuc += "\n --------------------------";
        }
        System.out.println(sonuc);
    }
}
