package j1;

public class arrays0 {
    public static void main(String[] args) {

        /*
         * Uygulama 1
         * 10 elemanlı bir diziye eleman olarak dizi indexinin karesini atayan uygulama
         */

        int[] dizi = new int[10];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) Math.pow(i, 2);
        }
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);
        }
    }
}
