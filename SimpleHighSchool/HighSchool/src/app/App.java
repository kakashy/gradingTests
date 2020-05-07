package app;

import java.util.Scanner;


public class App {
    public static void main(final String[] args) throws Exception {
        System.out.println("First Name:");
        final String firstName = new Scanner(System.in).nextLine();

        System.out.println("Second Name:");
        final String secondName = new Scanner(System.in).nextLine();

        System.out.println("Mathematics:");
        final int mathematics = new Scanner(System.in).nextInt();

        System.out.println("Kiswahili:");
        final int kiswahili = new Scanner(System.in).nextInt();

        System.out.println("English:");
        final int english = new Scanner(System.in).nextInt();

        System.out.println("Biology:");
        final int biology = new Scanner(System.in).nextInt();

        System.out.println("Physics:");
        final int physics = new Scanner(System.in).nextInt();

        System.out.println("Chemistry:");
        final int chemistry = new Scanner(System.in).nextInt();
        }

    public int mathematics;
}

class Grades extends App {
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

	public Grades() {
	}
}