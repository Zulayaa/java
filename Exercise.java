
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();

        try ( Scanner animalScan = new Scanner(Paths.get("animals.txt"))) {
            while (animalScan.hasNextLine()) {
                String line = animalScan.nextLine();
                String[] part = line.split(",");
                String name = part[0];
                String species = part[1];
                int age = Integer.valueOf(part[2]);
                Animal animal = new Animal(name, species, age);
                animals.add(animal);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Enter the name or species of the searched animal:");
        String search = scan.nextLine();
        boolean found = false;
        for (Animal currentAnimal : animals) {
            if (search.equalsIgnoreCase(currentAnimal.getName()) || search.equalsIgnoreCase(currentAnimal.getSpecies())) {
                System.out.println(currentAnimal);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Not found!");
        }
    }
}
