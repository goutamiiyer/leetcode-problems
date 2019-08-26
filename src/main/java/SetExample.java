import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("Onion");
        items.add("Green Chili");
        items.add("Ginger");
        items.add("Tomatoes");
        items.add("Cinnamon");
        items.add("Cloves");
        items.add("Bay Leaf");
        items.add("Ginger");
        System.out.println(items);
        Set<String> grocery = new LinkedHashSet<>();
        Iterator<String> item = items.iterator();
        for(int i = 0; i < items.size(); i++){
//            System.out.println(grocery);
            if (!grocery.contains(items.get(i))){
                grocery.add(items.get(i));
            }
        }
        System.out.println(grocery);
    }
}
