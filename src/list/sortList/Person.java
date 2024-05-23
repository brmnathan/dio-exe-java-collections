package list.sortList;

import java.util.Comparator;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private double height;

    public Person(int age, String name, double height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name
                + ", Age: " + age
                + ", Height: " + height;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(age, other.getAge());
    }
}

class comparatorByHeight implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return Double.compare(p1.getHeight(), p2.getHeight());
    }
}
