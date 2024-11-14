import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookDriver {
    public static void main (String[] args) {
        // Part 2
        List<String> originalChapters = new ArrayList<>(Arrays.asList(
                "Chapter 1",
                "Chapter 2",
                "Chapter 4"
        ));
        BookShallowCopy originalShallow = new BookShallowCopy("Shallow", "Shallow Author", originalChapters);
        BookShallowCopy shallowCopy = originalShallow.clone();

        originalChapters.add(2, "Chapter 3");
        System.out.println("Part 2");
        System.out.println(originalShallow);
        System.out.println(shallowCopy);

        // Part 3
        List<String> originalDeepChapters = new ArrayList<>(Arrays.asList(
                "Once",
                "Upon A",
                "Time"
        ));
        BookDeepCopy originalDeep = new BookDeepCopy("Deep", "Deep Author", originalDeepChapters);
        BookDeepCopy deepCopy = originalDeep.clone();

        originalDeepChapters.add("In a Land Faraway");
        System.out.println("Part 3");
        System.out.println(originalDeep);
        System.out.println(deepCopy);
    }
}
