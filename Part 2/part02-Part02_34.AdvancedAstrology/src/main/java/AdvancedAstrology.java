
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int printed = 0;
        while (printed < number) {
            System.out.print("*");
            printed++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int i = 0;
        while (i<number) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int number = 1;
        while (number <= size) {
            printSpaces(size - number);
            printStars(number);
            number++;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int number = 1;
        while (number <= height) {
            printSpaces(height - number);
            printStars(number + (number - 1));
            number++;
        }
        
        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
