package praktikum3;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionExample {
    public void demoArrayList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("ArrayList: " + list);
    }

    public void demoHashMap() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Satu");
        map.put(2, "Dua");
        map.put(3, "Tiga");
        System.out.println("HashMap: " + map);
    }
}