package app;
import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;


public class App {
    public static void main(final String[] args) throws Exception {
        final Scanner mainObj = new Scanner(System.in);

        System.out.println("First Name:");
        final String firstName = mainObj.nextLine();

        System.out.println("Second Name:");
        final String secondName = mainObj.nextLine();

        System.out.println("Mathematics:");
        public static int mathematics = mainObj.nextInt();

        System.out.println("Kiswahili:");
        public static int kiswahili = mainObj.nextInt();

        System.out.println("English:");
        public static int english = mainObj.nextInt();

        System.out.println("Biology:");
        public static int biology = mainObj.nextInt();

        System.out.println("Physics:");
        public static int physics = mainObj.nextInt();

        System.out.println("Chemistry:");
        public static int chemistry = mainObj.nextInt();
    }


public class Grades extends App {
    public void mathGrade(final String[] args) throws Exception {
		if (mathematics >= 70) {
            final String mathGrade = "A";
            final Byte mathPts = 12;
            System.out.println(mathGrade);
        } else {
            if (mathematics >= 65) {
                final String mathGrade = "A-";
                final Byte mathPts = 11;
            } else if (mathematics >= 50) {
                final String mathGrade = "B";
            System.out.println("Waaaaaauz");
        }
        else {
            System.out.println("Wheew");
        }
        }
    }
}