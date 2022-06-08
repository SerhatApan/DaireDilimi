import java.util.Scanner;
public class DaireDilimi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double alan, pi=3.14, yaricap, kesitalani;

        //kesit = a
        int kesit;
        System.out.print("Daire Yarıçapını Giriniz : ");
        yaricap = input.nextDouble();
        System.out.print("Daire Kesitinin Açısını Giriniz : ");
        kesit = input.nextInt();

        alan = (pi*(yaricap*yaricap)*kesit)/360;
        kesitalani = Math.round( alan * 100.0 ) / 100.0;
        System.out.println("Daire Kesitin Alanı : "+ kesitalani);



    }
}
