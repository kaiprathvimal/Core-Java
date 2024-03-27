import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSet {
    public static void main(String[] args) {
        Set<Integer> num = new TreeSet<Integer>();
        num.add(310);
        num.add(11);
        num.add(32);
        num.add(136);
        num.add(80);
        for (int n : num) {
            System.out.println(n);
        }
    }
}
