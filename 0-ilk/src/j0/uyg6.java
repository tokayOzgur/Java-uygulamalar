package j0;

public class uyg6 {

    public static void main(String[] args) {
        // Your code
        // 1'den 10'a kadar olan sayıları sırası ile ve aralarında virgül olacak
        // şeklinde ekrana yazdır
        String txt = "";
        for (int i = 1; i < 11; i++) {
            if (i != 10) {
                txt += i + ",";
            } else {
                txt += i;
            }
        }
        System.out.println(txt);
    }
}