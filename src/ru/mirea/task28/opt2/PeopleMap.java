package ru.mirea.task28.opt2;

import java.util.HashMap;
import java.util.Map;

public class PeopleMap {
    public static Map<String, String> createMap() {
        Map<String, String> peopleMap = new HashMap<>();
        peopleMap.put("Smith", "John");
        peopleMap.put("Johnson", "David");
        peopleMap.put("Williams", "John");
        peopleMap.put("Brown", "Michael");
        peopleMap.put("Jones", "John");
        peopleMap.put("Garcia", "Maria");
        peopleMap.put("Miller", "Jessica");
        peopleMap.put("Davis", "John");
        peopleMap.put("Rodriguez", "Sofia");
        peopleMap.put("Martinez", "David");
        return peopleMap;
    }

    public static int getSameFirstNameCount(Map<String, String> peopleMap, String name) {
        int count = 0;
        for (String firstName : peopleMap.values()) {
            if (firstName.equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int getSameLastNameCount(Map<String, String> peopleMap, String lastName) {
        int count = 0;
        for (String ln : peopleMap.keySet()) {
            if (ln.equals(lastName)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Map<String, String> people = createMap();
        int sameFirstNameCount = getSameFirstNameCount(people, "John");
        int sameLastNameCount = getSameLastNameCount(people, "Martinez");

        System.out.println("People with the same first name: " + sameFirstNameCount);
        System.out.println("People with the same last name: " + sameLastNameCount);
    }
}
