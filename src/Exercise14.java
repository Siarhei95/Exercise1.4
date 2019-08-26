import java.util.Scanner;

public class Exercise14 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nnn_ddd;
        System.out.print("Enter the namber as (nnn,ddd): ");
        nnn_ddd = scanner.nextDouble();
        double nnn = (int)nnn_ddd;
        double ddd = nnn_ddd - nnn;
        double num = (ddd*1000+ nnn/1000);
        System.out.println(Math.rint(1000*num)/1000);
    }

}
