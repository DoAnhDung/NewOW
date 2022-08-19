import java.util.Scanner;

public class XacDinhCanhTamGiac {

    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);

    }

    public static double array(double a, double b, double c){
        double array[] = new double[3];

        for ( int i=0; i<3; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("mang[" + i + "] =");
            array[i] = input.nextInt();
        }

        double max=array[0];

        for(int i=0;i<10;i++){
            if(array[i] > max){
                max=array[i];
            }
        }
        max=c;
        return c;
    }

}
