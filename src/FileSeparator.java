import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileSeparator {
    public static void main(String[] args) {
        // Step 1: Read from numbers.txt and separate into even.txt and odd.txt
        try {
            Scanner input = new Scanner(new File("numbers.txt"));
            PrintWriter evenWriter = new PrintWriter("even.txt");
            PrintWriter oddWriter = new PrintWriter("odd.txt");

            while (input.hasNextInt()) {
                int num = input.nextInt();
                if (num % 2 == 0) {
                    evenWriter.print(num + " ");
                } else {
                    oddWriter.print(num + " ");
                }
            }

            input.close();
            evenWriter.close();
            oddWriter.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error processing files.");
        }

        // Step 2: Read and display even.txt
        System.out.print("Even File: ");
        try {
            Scanner evenReader = new Scanner(new File("even.txt"));
            while (evenReader.hasNext()) {
                System.out.print(evenReader.next() + " ");
            }
            evenReader.close();
        } catch (FileNotFoundException e) {
            System.out.print("");
        }
        System.out.println();

        // Step 3: Read and display odd.txt
        System.out.print("Odd File: ");
        try {
            Scanner oddReader = new Scanner(new File("odd.txt"));
            while (oddReader.hasNext()) {
                System.out.print(oddReader.next() + " ");
            }
            oddReader.close();
        } catch (FileNotFoundException e) {
            System.out.print("");
        }
        System.out.println();
    }
}
