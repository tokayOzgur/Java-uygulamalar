package j1;

public class arrays5_siralama {
    public static void main(String[] args) {
        // Dizi elemanlarını karıştırma ve sıralama
        int[] sayilar = { 81, 62, 83, 44, 55, 26, 17 };
        System.out.println("\n\nNormal Dizi");
        diziYazdir(sayilar);

        System.out.println("\n\nElemanları karıştırılmış dizi");
        diziYazdir(DiziKaristir(sayilar));

        System.out.println("\n\nSelection Sort ile sıralanmış dizi");
        diziYazdir(selectionSort(sayilar));
    }

    // Dizi elemanlarını Sıralama - Selection Sort
    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            // en küçük elemanın ve index in bulunması
            int minDeger = arr[i]; // O anki en küçük elemanın değeri
            int minDegerIndex = i; // O anki en küçük elemanın indexi

            // elimizde olan elemanı dizinin diğer elemanlarıyla kıyaslama işlemi
            for (int j = i + 1; j < arr.length ; j++) {

                if (minDeger > arr[j]) {
                    minDeger = arr[j];
                    minDegerIndex = j;
                }
            }

            if (minDegerIndex != i) {
                arr[minDegerIndex] = arr[i];
                arr[i] = minDeger;
            }

        }
        return arr;
    }

    // Dizi elemanlarının yerini değiştirme metodu
    public static int[] DiziKaristir(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            // Rastgele index oluşturma
            int rastgeleIndex = (int) (Math.random() * (i + 1));
            int deger = arr[i]; // yeri değiştirilen değeri değişken de tutma

            // yer değiştirme işlemi
            arr[i] = arr[rastgeleIndex];
            arr[rastgeleIndex] = deger;

        }

        return arr;
    }

    // Diziyi ekrana yazdırma metodu
    public static void diziYazdir(int[] arr) {
        String p = "Dizinin Elemanları => ";
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                p += arr[i];
            } else {
                p += ", " + arr[i];
            }
        }
        System.out.println(p);
    }
}
