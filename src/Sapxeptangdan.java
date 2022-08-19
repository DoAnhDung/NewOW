import java.util.Scanner;
// <access modifier> static <kiểu dữ liệu> <tên method> ( danh sách tham số) code block;
// public static (khi gọi method cần có số lượng biến và kiểu dữ liệu của biến)
// Cách gọi method: tên method ( <danh sách đối số > )
/* b1: Viết hết vào method main
*  b2: Xác định chương trình có bao nhiêu chức năng (1 chức năng = 1 function
*  b3: viết từng function và gọi trong main. */

// danh sách tham số != danh sách đối số.

// BT: Nhap 3 so thuc. Kiem tra 3 so do co phai canh tam giac khong?
//     Nhap 3 so thuc. Giai phuong trinh ax^2 + bx +c = 0.
//
public class Sapxeptangdan {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int array[] = new int[10];

        for ( int i=0; i<10; i++) {
            System.out.println("Array[" + i + "] =");
            array[i] = input.nextInt();
        }

        int sotrunggian = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (array[i] > array[j]) {
                    sotrunggian = array[i];
                    array[i] = array[j];
                    array[j] = sotrunggian;
                }
            }
        }
        for ( int i=0; i<10; i++) {
            System.out.println(array[i]);
        }
    }
}
