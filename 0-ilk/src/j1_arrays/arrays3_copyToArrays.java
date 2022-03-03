package j1_arrays;

public class arrays3_copyToArrays {

    public static void main(String[] args) {
        int[] anaDizi = { 1, 2, 3, 4 };
        int[] kopyaDizi = new int[anaDizi.length];

        // ****** for ile kopyalama *******
        for (int i = 0; i < kopyaDizi.length; i++) {
            kopyaDizi[i] = anaDizi[i];
        }

        // ********* kopyalama metodu *******
        int[] kopyaDizi2 = new int[anaDizi.length];
        System.arraycopy(anaDizi, 0, kopyaDizi2, 0, anaDizi.length);

        // diziYazdır(kopyaDizi2);

        // ******* kopyalama işlemi 3 **********
        int[] kopyaDizi3 = new int[anaDizi.length];
        kopyaDizi3 = anaDizi;
        // diziYazdır(kopyaDizi3);

        // ---------------------------------------------------------------
        anaDizi[0] = 100; // 0.indexi 100 yaptık
        diziYazdır(kopyaDizi3); // burada anaDizinin ramdeki referans değerini kopyaDizi3'e verdiğimizden dolayı
                                // bir değişiklik ikisinde de geçerli oluyor
        // tersten yazdırma
        TerstenYazdir(anaDizi);
    }

    // Ekrana yazdırma metodu
    public static void diziYazdır(int[] arr) {
        System.out.println("\n\nDizi ekrana yazdırılıyor");
        // Ekrana yazdırma0
        for (int sayi : arr) {
            System.out.print(sayi + ", ");
        }
    }

    // Diziyi tersten yazdıran metot
    public static void TerstenYazdir(int[] arr) {
        int tersArr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tersArr[i] = arr[arr.length - 1 - i];
        }
        diziYazdır(tersArr);
    }
}
