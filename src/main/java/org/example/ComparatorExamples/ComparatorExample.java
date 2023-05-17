package org.example.ComparatorExamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {

        Person person_1 = new Person("Jane", 32);
        Person person_2 = new Person("Ray", 64);
        Person person_3 = new Person("Mike", 31);
        Person person_4 = new Person("Jon", 23);
        Person person_5 = new Person("Mary", 37);

        List<Person> personList = Arrays.asList(person_1, person_2, person_3, person_4, person_5);

//        Using Comparable
//        Collections.sort(personList);
//        System.out.println(personList);

//        Using comparator
//        PersonAgeComparator personAgeComparator = new PersonAgeComparator();
//        Collections.sort(personList, personAgeComparator);
//        System.out.println(personList);

        PersonNameComparator personNameComparator = new PersonNameComparator();
        PersonAgeComparator personAgeComparator = new PersonAgeComparator();
        Collections.sort(personList, personNameComparator.thenComparing(personAgeComparator));
        System.out.println(personList);
    }
}
