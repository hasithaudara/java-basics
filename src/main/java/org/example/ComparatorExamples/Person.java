package org.example.ComparatorExamples;

public class Person implements Comparable<Person> {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person person) {

        return person.getName().compareTo(this.getName());
//        return this.getAge() - person.getAge() ; // This make the list to sort ascending order - numerals
//        return person.getAge() - this.getAge(); // This make the list to sort descending order - numerals
//        return Integer.compare(person.getAge(),this.getAge());
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
