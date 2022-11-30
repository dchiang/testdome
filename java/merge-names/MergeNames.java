import java.util.*;

public class MergeNames {

    public static String[] uniqueNames(String[] names1, String[] names2) {
        Set<String> uniqueNames = new HashSet<String>(Arrays.asList(names1));
        uniqueNames.addAll(Arrays.asList(names2));
        return uniqueNames.toArray(String[]::new);
    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}
