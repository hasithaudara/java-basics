package org.example.CollectionExample;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TraverseExample {

    public static void main(String[] args) {

//        Traverse through a List
//        List<String> letterList = List.of("A", "B", "C", "D");

//        for (String listElement : letterList) {
//            System.out.println(listElement);
//        }

//        Traverse through a Set
//        Set<String> letterSet = Set.of("A", "B", "C", "D", "E");
//
//        for (String s : letterSet){
//            System.out.println(s);
//        }

//        Traverse through a Map
        Map<Integer, String> letterMap = Map.of(1, "A", 2, "B", 3, "C", 4, "D");

//        Using Keys
        Iterator<Integer> keysItr = letterMap.keySet().iterator();

        while(keysItr.hasNext()) {
            System.out.println(keysItr.next());
        }
//        Using Values
        Iterator<String> valuesItr = letterMap.values().iterator();
        while (valuesItr.hasNext()) {
            System.out.println(valuesItr.next());
        }
//        Using entries
        Iterator<Map.Entry<Integer, String>> entryIterator = letterMap.entrySet().iterator();
        while (entryIterator.hasNext()) {
            System.out.println(entryIterator.next().getKey());
//            System.out.println(entryIterator.next().getValue());
        }
    }
}
