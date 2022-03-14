
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Which file should have its contents printed?");
        String text = scanner.nextLine();
        
        try (Scanner reader = new Scanner(Paths.get(text))) {
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Reading the file failed.");
        }

    }
}
