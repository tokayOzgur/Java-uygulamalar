package j1Arrays;

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

        System.out.println("\n\nBinary Search ile arama - İndex değeri");
        System.out.println(binarySearch(sayilar, 83));
    }

    public static int binarySearch(int[] arr, int arancakVal) {
        // Adım1 - Dizi elemanları sıralı olmak zorundadır.
        arr = selectionSort(arr);
        int minIndex = 0;
        int maxIndex = arr.length - 1;
        while (maxIndex >= minIndex) {
            int midIndex = (minIndex + maxIndex) / 2;
            // Aranan değer midIndexin solundaysa
            if (arancakVal < arr[midIndex]) {
                maxIndex = midIndex - 1;
            } else if (arancakVal == arr[midIndex]) {
                return midIndex; // aranan elemanın bulunduğu indexi döndürür
            }
            // Aranan değer midIndexin sağındaysa
            else {
                minIndex = midIndex + 1;
            }

        }
        return minIndex - 1;
    }

    // Dizi elemanlarını Sıralama - Selection Sort
    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            // en küçük elemanın ve index in bulunması
            int minDeger = arr[i]; // O anki en küçük elemanın değeri
            int minDegerIndex = i; // O anki en küçük elemanın indexi

            // elimizde olan elemanı dizinin diğer elemanlarıyla kıyaslama işlemi
            for (int j = i + 1; j < arr.length; j++) {

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
