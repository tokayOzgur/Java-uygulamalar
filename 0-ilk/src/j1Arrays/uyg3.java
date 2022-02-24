package j1Arrays;

public class uyg3 {
    public static void main(String[] args) {
        /*
         * İskambil destesini diziler ile oluşturun. Sonrasında bu destedeki elemanları
         * karıştırın ve de ilk kullanıcıya hangi 4 kartın geldiğini ekrana yazdırın.
         */
        String[] iskambil = { "Karo As", "Karo 2", "Karo 3", "Karo 4", "Karo 4", "Karo 5", "Karo 6", "Karo 7", "Karo 8",
                "Karo 9", "Karo 10", "Karo Joker", "Karo Kız", "Karo Papaz", "Kupa As", "Kupa 2", "Kupa 3", "Kupa 4",
                "Kupa 5", "Kupa 6", "Kupa 7", "Kupa 8", "Kupa 9", "Kupa 10", "Kupa Joker", "Kupa Kız", "Kupa Papaz",
                "Maça As", "Maça 2", "Maça 3", "Maça 4", "Maça 5", "Maça 6", "Maça 7", "Maça 8", "Maça 9", "Maça 10",
                "Maça Joker", "Maça Kız", "Maça Papaz", "Sinek As", "Sinek 2", "Sinek 3", "Sinek 4", "Sinek 5",
                "Sinek 6", "Sinek 7", "Sinek 8", "Sinek 9", "Sinek 10", "Sinek Joker", "Sinek Kız", "Sinek Papaz" };

        String dizi[] = diziKaristir(iskambil);
        System.out.println("Kart 1: " + dizi[0]);
        System.out.println("Kart 1: " + dizi[1]);
        System.out.println("Kart 1: " + dizi[2]);
        System.out.println("Kart 1: " + dizi[3]);
    }

    public static String[] diziKaristir(String[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            int randIndex = (int) (Math.random() * (i + 1));// Random index Oluşturma
            String deger = arr[i]; // Burada yeri değiştirilecek değeri bir değişken de tutuyoruz, sonradan
                                   // kullanmak için

            // Yer değiştirme işlemi
            arr[i] = arr[randIndex];
            arr[randIndex] = deger;
        }
        return arr;
    }
}