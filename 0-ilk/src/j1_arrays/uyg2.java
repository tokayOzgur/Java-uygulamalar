package j1_arrays;

public class uyg2 {
    public static void main(String[] args) {
        /*
         * Her bir elemanı rastgele oluşturulmuş 3x2 lik bir matriste bulunan sayıların
         * toplamını yazdıran program.
         * Ayrıca bu matriste yer alan en küçük ve en büyük elemanları ekrana yazdırın.
         */

        int toplam = 0;
        int[][] matris = new int[3][2];
        for (int satir = 0; satir < matris.length; satir++) {
            for (int sutun = 0; sutun < matris[satir].length; sutun++) {
                matris[satir][sutun] = (int) (Math.random() * 100); // Random değer atamak
                toplam += matris[satir][sutun];
            }
        }
        System.out.println("\nMatris: ");
        diziYazdir(matris);

        System.out.println("\n\nToplam: " + toplam);

        System.out.print("\nMin,Max: ");
        diziYazdir(maxMinValue(matris));

    }

    // tek boyutlu dizileri ekrana yazdırma
    public static void diziYazdir(int[] arr) {
        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }

    // iki Boyutlu dizileri ekrana yazdırma
    public static void diziYazdir(int[][] arr) {
        System.out.println("\n_________________");
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print("| " + arr[row][column] + "  |  ");
            }
            System.out.println("\n_________________");
        }
    }

    public static int[] maxMinValue(int[][] arr) {
        int maxNum = arr[0][0];
        int minNum = arr[0][0];
        for (int[] j : arr) {
            for (int x : j) {
                if (x > maxNum)
                    maxNum = x;
                if (x < minNum)
                    minNum = x;
            }
        }
        int[] minMax = { maxNum, minNum };
        return minMax;
    }
}
