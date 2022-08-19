import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {

        // khai báo mảng
        int arr[] = {1, 2, 3, 4, 5};
        double[] arr1 = {1, 2, 3, 4};
        int arr2[] = new int[10];
        double[] arr3 = new double[10];

        char[] arr4 = new char[20];

        // Truy xuất phần từ
        // ( tên mảng )[index]

        /*       */

        int tong =0;
        int [] mang= new int[10];
        Scanner input = new Scanner(System.in);

        for ( int i=0; i<10; i++) {
            System.out.println("mang[" + i + "] =");
            mang[i] = input.nextInt();
        }
            for (int i = 0; i < 10; i++) {
                tong += mang[i];
            }

            System.out.println("Tong = " + tong);


    }

}
