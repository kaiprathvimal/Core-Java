import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String,Integer> students = new HashMap<>();
        students.put("vimal", 22);
        students.put("Amal", 12);
        students.put("vimal", 32);
        students.put("abs", 29);
        System.out.println(students);

        for ( String key : students.keySet()) {
            System.out.println(key + " " + students.get(key) );
        }


    }
}
