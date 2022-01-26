import java.util.Scanner;

public class TestFile {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int year = scnr.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " - leap year");
                } else {
                    System.out.println(year + " - not a leap year");
                }
            } else {
                System.out.println(year + " - leap year");
            }
        } else {
            System.out.println(year + " - not a leap year");
        }
    }
}
