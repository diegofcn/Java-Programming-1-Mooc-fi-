
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        for (int stars: array) {
            printStars(stars);
            System.out.println();
        }
    }
    
     public static void printStars(int i) {
        while (i > 0) {
            System.out.print("*");
            i = i - 1;
        }
     }

}
