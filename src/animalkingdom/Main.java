package animalkingdom;

import java.util.*;

public class Main {
    public static void showAnimals(ArrayList<AbstractAnimals> animals, CheckAnimal tester){
        for (AbstractAnimals a : animals){
            if(tester.test(a)){
                System.out.println("Species: " + a.getSpecies()  + ", Name: " + a.getName() + ", Breath: " + a.getBreath() + ", Year Named: " + a.getYear() + ", Moves: " + a.getMove() + ", Reproduce: " + a.getReproduce());
            }
        }
    }

    public static void main(String[] args) {

        //Mammals
        Mammal panda = new Mammal(0, "Panda", 1869);
        Mammal zebra = new Mammal(1, "Zebra", 1778);
        Mammal koala = new Mammal(2, "Koala", 1816);
        Mammal sloth = new Mammal(3, "Sloth", 1804);
        Mammal armadillo = new Mammal(4, "Armadillo", 1758);
        Mammal racoon = new Mammal(5, "Racoon", 1758);
        Mammal bigfoot = new Mammal(6, "Bigfoot", 2021);

        //birds
        Birds pigeon = new Birds(7, "Pigeon", 1837);
        Birds peacock = new Birds(7, "Peacock", 1821);
        Birds toucan = new Birds(7, "Toucan", 1758);
        Birds parrot = new Birds(7, "Parrot", 1824);
        Birds swan = new Birds(7, "Swan", 1758);

        //Fish
        Fish salmon = new Fish(12, "Salmon", 1758);
        Fish catfish = new Fish(12, "Catfish", 1812);
        Fish perch = new Fish(12, "Perch", 1758);

        ArrayList<AbstractAnimals> animalList = new ArrayList<AbstractAnimals>();
        animalList.add(panda);
        animalList.add(zebra);
        animalList.add(koala);
        animalList.add(sloth);
        animalList.add(armadillo);
        animalList.add(racoon);
        animalList.add(bigfoot);
        animalList.add(pigeon);
        animalList.add(peacock);
        animalList.add(parrot);
        animalList.add(swan);
        animalList.add(salmon);
        animalList.add(catfish);
        animalList.add(perch);
        animalList.add(toucan);
        

        // All animals
        System.out.println();
        System.out.println(animalList.toString());

        System.out.println("*** Sorting ***");
        System.out.println();
        
        System.out.println("* Animals sorted Alphabetically by Name");
        animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        animalList.forEach((a) -> System.out.println(a));
        System.out.println();

        System.out.println("* Animals sorted decending order by Year Named*");
        animalList.sort((a1, a2) -> a2.getYear() - a1.getYear());
        animalList.forEach((a) -> System.out.println(a));
        System.out.println();

        System.out.println("* Animals sorted by how they move *");
        animalList.sort((a1, a2) -> a1.getMove().compareToIgnoreCase(a2.getMove()));
        animalList.forEach((a) -> System.out.println(a));
        System.out.println();

        System.out.println("* Animals breath with lungs *");
        showAnimals(animalList, a -> (a.getBreath().equals("Lungs")));
        System.out.println();

        System.out.println("* Animals breath with lungs and named in 1758 *");
        showAnimals(animalList, ((a -> a.getBreath().equals("Lungs") && a.getYear() == 1758)));
        System.out.println();

        System.out.println("* Animals breath with lungs and lay eggs");
        showAnimals(animalList, ((a -> a.getBreath().equals("Lungs") && a.getReproduce() == "Eggs")));
        System.out.println();

        System.out.println("* Animals sorted alphabetically and named in 1758 *");
        animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        showAnimals(animalList, (a -> a.getYear() == 1758));
        System.out.println();

        System.out.println("** Alphabetically sorted Mammals **");
        System.out.println();
        System.out.println();
        System.out.println("* Mammals Sorted using getSpecies *");
        animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        showAnimals(animalList, (a -> a.getSpecies().equals("Mammals")));
        System.out.println();
        System.out.println("* Mammals Sorted using getId *");
        animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        showAnimals(animalList, (a -> a.getId() <= 6 ));
        System.out.println();
        System.out.println("* Mammals Sorted using instanceof *");
        showAnimals(animalList, (a -> a instanceof Mammal));
        System.out.println();

        System.out.println("** Alphabetically sorted Birds **");
        System.out.println();
        System.out.println();
        System.out.println("* Birds Sorted using getSpecies *");
        animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        showAnimals(animalList, (a -> a.getSpecies().equals("Birds")));
        System.out.println();
        System.out.println("* Birds Sorted using getId *");
        animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        showAnimals(animalList, ((a -> (a.getId() > 6) && (a.getId() < 12))));
        System.out.println();
        System.out.println("* Birds Sorted using instanceof *");
        showAnimals(animalList, (a -> a instanceof Birds));
        System.out.println();


        System.out.println("** Alphabetically sorted Fish **");
        System.out.println();
        System.out.println();
        System.out.println("* Fish Sorted using getSpecies *");
        animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        showAnimals(animalList, (a -> a.getSpecies().equals("Fish")));
        System.out.println();
        System.out.println("* Fish Sorted using getId *");
        animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        showAnimals(animalList, (a -> a.getId() >= 12 ));
        System.out.println();
        System.out.println("* Fish Sorted using instanceof *");
        showAnimals(animalList, (a -> a instanceof Fish));
        System.out.println();
        


        
    }
}