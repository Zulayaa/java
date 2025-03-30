
import java.util.Scanner;
import java.util.ArrayList;

public class printProblem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int number = Integer.valueOf(scan.nextLine());
            if (number == -1) {
                break;
            }
            list.add(number);
        }
        System.out.println("");
        System.out.print("Search for? ");
        int number = Integer.valueOf(scan.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == number) {
                System.out.println(number + " is at index " + i);
            }
        }
    }
}
