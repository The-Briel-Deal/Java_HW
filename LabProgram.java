import java.util.Scanner;

public class LabProgram {
    public static double productOfFour(int a, int b, int c, int d) {
        double ad = a;
        return (ad * b * c * d);
    }

    public static double averageOfFour(int a, int b, int c, int d) {
        return (a + b + c + d) / 4.0;
    }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        int a = scnr.nextInt();
        int b = scnr.nextInt();
        int c = scnr.nextInt();
        int d = scnr.nextInt();
        System.out.format("%.3f %.3f", productOfFour(a, b, c, d), averageOfFour(a, b, c, d));
    }
}
