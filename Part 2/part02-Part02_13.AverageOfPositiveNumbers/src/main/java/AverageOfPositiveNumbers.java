
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        double sum = 0;
        
        while (true) {
            double input = Double.valueOf(scanner.nextLine());
            
            if (input == 0) {
                break;
            }
            if (input < 0) {
                continue;
            }
            
            number = number + 1;
            sum = sum + input;
        }
        if (number == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(sum/number);
        }
        

    }
}
