import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(4);
        nums.add(12);
        nums.add(2);
        nums.add(234);
        nums.add(45);
        System.out.println("Index : " + nums.get(2));
        for (int n  : nums) {
            System.out.println(n);
        }

    }
}
