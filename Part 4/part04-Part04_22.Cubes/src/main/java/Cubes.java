
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String name = scanner.nextLine();
            if (name.equals("end")) {
                break;
            }
            int number = Integer.valueOf(name);
            System.out.println(number * number * number);
        }
        

    }
}
