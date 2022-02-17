package j1;

public class arrays4_2D {
    public static void main(String[] args) {
        // Your code
        // 2x2 boyutlu matris oluşturma
        int[][] mSayilar1 = new int[2][2];

        // ******* diziye değer ekleme -1 ********
        mSayilar1[0][0] = 1; //
        mSayilar1[0][1] = 2; //
        mSayilar1[1][0] = 3; //
        mSayilar1[1][1] = 4; //

        // ******* diziye değer ekleme 2 ********
        // 2x2 boyutlu matris
        int[][] mSayilar2 = { { 1, 2 }, { 3, 4 } };

        ekranaYazdir(mSayilar2);
    }

    public static void ekranaYazdir(int[][] arr) {
        for (int satir = 0; satir < arr.length; satir++) {
            for (int sutun = 0; sutun < arr[satir].length; sutun++) {
                System.out.println(satir + "x" + sutun + " => " + arr[satir][sutun]);
            }
        }
    }
}
