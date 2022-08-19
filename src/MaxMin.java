import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// cho mang 10 so thuc, sap xep theo chieu tang dan
import java.util.Scanner;


public class MaxMin {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int array[] = new int[10];

        for ( int i=0; i<10; i++) {
            System.out.println("mang[" + i + "] =");
            array[i] = input.nextInt();
        }
        double min=array[0];
        double max=array[0];

        for(int i=0;i<10;i++){
            if(array[i]< min){
                min=array[i];
            }



        }
    }
}
