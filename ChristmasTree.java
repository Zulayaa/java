
import java.util.Scanner;

public class ChristmasTree {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What size tree do you want?");
        int size = Integer.valueOf(scan.nextLine());
        printChristmasTree(size);
    }

    public static void printStar(int size) {
        for (int star = 1; star < size; star++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpace(int size) {
        for (int space = 1; space < size; space++) {
            System.out.print(" ");
        }

    }

    public static void printChristmasTree(int size) {
        for (int tree = 1; tree < size; tree++) {
            printSpace(size - tree);
            printStar(2 * tree);
            if (tree % 4 == 0 && tree != size) {
                printSpace(size - 2);
                printStar(4);
            }
        }
        for (int base = 0; base < 2; base++) {
            printSpace(size - 2);
            printStar(4);
        }
    }
}
