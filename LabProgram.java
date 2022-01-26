import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String var = scnr.nextLine();
        System.out.println("You entered: " + var);
        if (var.indexOf("BFF") > 0) {
            System.out.println("BFF: best friend forever");
        }
        if (var.indexOf("IDK") > 0) {
            System.out.println("IDK: I don't know");
        }
        if (var.indexOf("JK") > 0) {
            System.out.println("JK: just kidding");
        }
        if (var.indexOf("TMI") > 0) {
            System.out.println("TMI: too much information");
        }
        if (var.indexOf("TTYL") > 0) {
            System.out.println("TTYL: talk to you later");
        }

        // System.out.println("Input an abbreviation:");
        // if (var.equals("LOL")) {
        // System.out.println("laughing out loud");
        // } else if (var.equals("IMHO")) {
        // System.out.println("in my humble opinion");
        // } else if (var.equals("TMI")) {
        // System.out.println("too much information");
        // } else if (var.equals("BFF")) {
        // System.out.println("best friends forever");
        // } else if (var.equals("IDK")) {
        // System.out.println("I don't know");
        // } else {
        // System.out.println("Unknown");
    }
}
