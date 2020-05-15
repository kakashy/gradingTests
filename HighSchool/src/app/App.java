package app;

import java.util.Scanner;

public class App {
    String firstName;
    String secondName;
    int mathematics;
    public void main(final String[] args) throws Exception {
        final App myDara = new App();
        final Scanner myInput = new Scanner(System.in); //cool input object

        System.out.println("Please enter the first name:");
        myDara.firstName = myInput.nextLine();

        System.out.println("Please enter the second name:");
        myDara.secondName = myInput.nextLine();

        System.out.println("Mathematics:");
        myDara.mathematics = myInput.nextInt();

        GradeTing();
    }

    public void GradeTing() {
        System.out.println("Grades incoming..");
        System.out.println(mathematics);
    }

}