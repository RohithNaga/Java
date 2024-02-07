package practisePrograms;
import java.util.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public interface Interface2 {
    void printit(String text);
    void disconnect();
}

class ibmprint implements Interface2 {
    public void printit(String text) {
        System.out.println(text);
    }
    public void disconnect() {
        System.out.println("printing completed");
        System.out.println("disconnecting from the ibm printer");
    }
}

class epson implements Interface2 {
    public void printit(String text) {
        System.out.println(text);
    }
    public void disconnect() {
        System.out.println("printing completed");
        System.out.println("disconnecting from the epson printer");
    }
}

class InterfaceDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the text: ");
        String textToPrint = sc.nextLine();
        System.out.println("the text that will print: ");

        try {
            // Select the printer (ibmprint or epson)
            Interface2 printer = new ibmprint(); // Change to epson() for Epson printer

            // Perform printing and disconnection tasks
            printer.printit(textToPrint);
            printer.disconnect();
        } catch (Exception e) {
            // Handle any exceptions that may occur
            System.out.println("Error occurred: " + e.getMessage());

            
        /* // Provide the path to the config.txt file
        String filePath = "practisePrograms/config.txt";

        try {
            // FileReader and BufferedReader to read the file
            FileReader fr = new FileReader(filePath);
            BufferedReader lr = new BufferedReader(fr);

            // Read the printer name from the file
            String printerName = lr.readLine();
            System.out.println("loading the driver for: " + printerName);

            // Load the class based on the printer name
            Class<?> c = Class.forName("practisePrograms." + printerName);
            Interface2 ref = (Interface2) c.getDeclaredConstructor().newInstance();

            // Perform printing and disconnection tasks
            ref.printit("hello, this is printed on the printer");
            ref.disconnect();

            // Close the BufferedReader
            lr.close();
        } catch (IOException e) {
            // Handle file-related IO errors
            System.out.println("Error reading the file: " + e.getMessage());
        } catch (Exception e) {
            // Handle other exceptions
            System.out.println("Error occurred: " + e.getMessage());
        } */
        }
    }
}