import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> attendance = new LinkedHashMap<>();
        List<String> names = new LinkedList<>();
        names.add("Goutami");
        names.add("Deepak");
        names.add("Balaji");
        names.add("Goutami");

        for (String name: names) {
            attendance.put(name, attendance.getOrDefault(name, 0)+1);
            System.out.println(attendance);
        }
//        System.out.println(attendance);

    }
}
