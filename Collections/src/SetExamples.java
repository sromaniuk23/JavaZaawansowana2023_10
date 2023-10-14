import java.util.HashSet;
import java.util.Set;

public class SetExamples {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("John");
        names.add("Neeki");
        names.add("Packia");
        names.add("John");
//        names.remove("John"); //usuniecie Johna

        if (names.contains("John")){
            System.out.println("Element istniej");
        }
        for (String name : names) {
            System.out.println(name);
        }


    }
}
