import java.util.Scanner; // Import the Scanner class
import java.io.File; // Import the File class
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.BufferedWriter;   // Import the BufferedWriter class

class major {
  /**
   *
   */

  public static void main(final String[] args) {
    final Scanner myObj = new Scanner(System.in); // Create a Scanner object
    
    System.out.println("Enter first name: ");
    final String firstName = myObj.nextLine(); // First name input

    System.out.println("Great, please enter the second name: ");
    final String secondName = myObj.nextLine(); // Second name input

    System.out.println("Marks for Mathematics:");
    final byte mathematics = myObj.nextByte();  // Input for the first subjet, stored in byte format

    System.out.println("Marks for English:");
    final byte english = myObj.nextByte(); 

    System.out.println("Marks for Kiswahili:");
    final byte kiswahili = myObj.nextByte();
    
    // calculate total marks and relay the same
    final int totals = mathematics + kiswahili + english;
    System.out.println("The max total for this exam was 300 marks.");
    System.out.println(firstName + ", has " + totals + " marks out of 300.");

      // creating a report file
      try {
        final File nuObj = new File("report.txt");
        if (nuObj.createNewFile()) {
          System.out.println("File created: " + nuObj.getName());
        } else {
          System.out.println("File already exists.");
        }
      } catch (final IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }

      // Saving the data into the file
      try {
        final File deyra = new File("report.txt");
        final BufferedWriter myWriter = new BufferedWriter(new FileWriter(firstName + "students/report.txt", true)); //The file can be written several times
        myWriter.write("Full Names: " + firstName + " " + secondName);
        myWriter.newLine();
        myWriter.write("Mathematics: " + mathematics);
        myWriter.newLine();
        myWriter.write("English: " + english);
        myWriter.newLine();
        myWriter.write("Kiswahili: " + kiswahili);
        myWriter.newLine();
        myWriter.write("TOTALS: " + totals + "/300");
        myWriter.newLine();
        myWriter.newLine();
        myWriter.close();
        
        System.out.println("Successfully wrote to the file. And it's saved at: " + deyra.getName());
      } catch (final IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }


  }
}