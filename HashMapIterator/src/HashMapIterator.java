import java.util.*;

public class HashMapIterator {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("lion", "con su tu");
        hashMap.put("spectre", "bong ma");
        hashMap.put("Orange", "Cam");

        // sử dụng Iterator để lấy toàn bộ entry của hashMap
        // vì 1 entry bao gồm key và value
        // nên kiểu dữ liệu của Iterator sẽ bao gồm
        // kiểu dữ liệu của cả key và value
        Iterator<Map.Entry<String,
                String>> iteratorEntry = hashMap.entrySet().iterator();
        System.out.println("Các entry có trong hashMap là: ");
        while (iteratorEntry.hasNext()) {
            System.out.println(iteratorEntry.next());
        }
        System.out.println("-----");

        System.out.println("Các entry có trong hashMap là: ");
        Set setKey = hashMap.keySet();
//        object
        for (Object keys : setKey) {
            System.out.println("Key: " + keys + "  Value: " + hashMap.get(keys));
        }
        System.out.println("-----");

        System.out.println("Các entry có trong hashMap là: ");
//        string
        for (String keys : hashMap.keySet()) {
            System.out.println("Key: " + keys + "  Value: " + hashMap.get(keys));
        }


        // nên iterator cũng có kiểu là String

        Iterator<String> iteratorKey = hashMap.keySet().iterator();
        System.out.println("Key có trong hashMap là: ");
        while (iteratorKey.hasNext()) {
            System.out.println(iteratorKey.next());
        }

        System.out.println("-----");
        System.out.println("Key có trong hashMap là: ");
//        Set setKey = hashMap.keySet();
        for (Object keys : setKey) {
            System.out.println(keys);
        }
        // nên iterator cũng có kiểu là String
        Iterator<String> iteratorValue = hashMap.values().iterator();
        System.out.println("Value có trong hashMap là: ");
        while (iteratorValue.hasNext()) {
            System.out.println(iteratorValue.next());
        }
        System.out.println("-----");

        System.out.println("Value có trong hashMap là: ");
        for (Object keys : setKey) {
            System.out.println(hashMap.get(keys));
        }

        //Tim kiem
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the world you find: ");
        String keyword = scanner.nextLine();
        if (hashMap.containsKey(keyword)) {
            System.out.println("Translate: " + hashMap.get(keyword));
        } else {
            System.out.println("Not found!!!");
        }

    }
}