
import java.util.Scanner;

public class shape {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("What shape do you want to see?\n"
                    + "Type: square, triangle, 90triangle(L), 90triangle(R), rectangle\n"
                    + "Type: exit (to exit)");

            String shape = scan.nextLine();
            System.out.println("");
            if (shape.equals("exit")) {
                break;
            }
            if (shape.equals("square")) {
                System.out.println("How big square would you like?\nEnter only one number:");
                int squareSize = Integer.valueOf(scan.nextLine());
                System.out.println("");
                square(squareSize);
            } else if (shape.equals("triangle")) {
                System.out.println("How tall triangle would you like?\nEnter only one number:");
                int triangleSize = Integer.valueOf(scan.nextLine());
                System.out.println("");
                triangle(triangleSize);
            } else if (shape.equals("90triangle(L)")) {
                System.out.println("How tall triangle would you like?\nEnter only one number:");
                int triangleSizeL = Integer.valueOf(scan.nextLine());
                System.out.println("");
                triangleL(triangleSizeL);
            } else if (shape.equals("90triangle(R)")) {
                System.out.println("How tall triangle would you like?\nEnter only one number:");
                int triangleSizeR = Integer.valueOf(scan.nextLine());
                System.out.println("");
                triangleR(triangleSizeR);
            } else if (shape.equals("rectangle")) {
                System.out.println("How tall rectangle would you like?\nEnter the first number:");
                int rectangleSizeHeight = Integer.valueOf(scan.nextLine());
                System.out.println("How wide rectangle would you like?\nEnter the second number:");
                int rectangleSizeWidth = Integer.valueOf(scan.nextLine());
                System.out.println("");
                rectangle(rectangleSizeHeight, rectangleSizeWidth);
            } else {
                System.out.println("Not valid shape!");
                System.out.println("");
            }
        }
    }

    public static void printStars(int size) {
        for (int star = 0; star <= size; star++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int size) {
        for (int space = 1; space < size; space++) {
            System.out.print(" ");
        }
    }

    public static void square(int size) {
        for (int square = 0; square < size; square++) {
            printStars(size);
        }
        System.out.println("");
    }

    public static void triangle(int size) {
        for (int triangle = 0; triangle < size; triangle++) {
            printSpaces(size - triangle);
            printStars(triangle * 2);
        }
        System.out.println("");
    }

    public static void triangleL(int size) {
        for (int triangleL = 0; triangleL < size; triangleL++) {
            printStars(triangleL);
        }
        System.out.println("");
    }

    public static void triangleR(int size) {
        for (int triangleR = 0; triangleR < size; triangleR++) {
            printSpaces(size - triangleR);
            printStars(triangleR);
        }
        System.out.println("");
    }

    public static void rectangle(int height, int width) {
        for (int rectangle = 0; rectangle < height; rectangle++) {
            printStars(width);
        }
        System.out.println("");
    }

}
