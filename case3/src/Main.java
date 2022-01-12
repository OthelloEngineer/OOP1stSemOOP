import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        System.out.println(animalList.getClass());
        addAnimals((ArrayList<Animal>) animalList);
        makeNoise(animalList);

    }

    private static void makeNoise(List<Animal> animalList){
        for (Animal animal: animalList) {
            animal.makeSound();
        }
    }

    private static void addAnimals(ArrayList<Animal> animalList){
        Scanner scanner = new Scanner(System.in);
//        animalList.add((Animal)animalFactory(scanner.next()));
//        animalList.add((Animal)animalFactory(scanner.next()));
//        animalList.add((Animal)animalFactory(scanner.next()));
//        animalList.add((Animal)animalFactory(scanner.next()));
//        animalList.add((Animal)animalFactory(scanner.next()));
    }

    private static Object animalFactory(String animal){
        return switch(animal.toLowerCase()) {
            case "dog" -> new Dog();
            case "cat" -> new Cat();
            default -> new Snake();
        };
    }
}
