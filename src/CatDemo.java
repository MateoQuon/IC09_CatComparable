import java.util.ArrayList;
import java.util.Collections;

public class CatDemo {
    public static void main(String[] args) {

        //ArrayLists are dynamically sized, default cap = 10
        // + collection of related data under a single data type
        ArrayList<Cat> clowder = new ArrayList<>();

        // Add cats into the clowder
        clowder.add(new Cat("Boba Pearl", "Tuxedo", 2));
        clowder.add(new Cat("Dino", "Black", 8));
        clowder.add(new Cat("Cole", "Orange", 6));
        clowder.add(new Cat("Lucy", "Orange", 8));
        clowder.add(new Cat("Winona", "Black", 3));

        // To remove an object: clowder.remove(index); || clowder.remove(Cat c)
        // clowder.clear(); Nulls out all the cats. size = 0

        // With ArrayList, they can be auto-sorted in ascending order
        System.out.println("Unsorted Clowder of Cats: ");
        // Use for each loop with array lists
        for (Cat c: clowder)  // For each cat object (temp c) in ArrayList named clowder
            System.out.println(c);

        Collections.sort(clowder);

        System.out.println("\nSorted Clowder of Cats: ");
        for (Cat c: clowder)  // For each cat object (temp c) in ArrayList named clowder
            System.out.println(c);
    }
}
