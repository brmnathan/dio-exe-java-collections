package list.sortList;

public class Program {
    public static void main(String[] args) {
        Person p1 = new Person(35, "Harry Potter", 170.0);
        Person p2 = new Person(104, "Bilbo Baggins", 122.0);
        Person p3 = new Person(30, "Katniss Everdeen", 165.0);
        Person p4 = new Person(45, "Sherlock Holmes", 183.0);
        Person p5 = new Person(900, "Yoda", 66.0);
        Person p6 = new Person(35, "Princess Leia", 157.0);
        Person p7 = new Person(35, "Frodo Baggins", 106.0);
        Person p8 = new Person(42, "Hermione Granger", 163.0);
        Person p9 = new Person(40, "Jon Snow", 178.0);
        Person p10 = new Person(35, "Aragorn", 186.0);

        PeopleList peopleList = new PeopleList();

        //Add person to list
        peopleList.addPerson(p1);
        peopleList.addPerson(p2);
        peopleList.addPerson(p3);
        peopleList.addPerson(p4);
        peopleList.addPerson(p5);
        peopleList.addPerson(p6);
        peopleList.addPerson(p7);
        peopleList.addPerson(p8);
        peopleList.addPerson(p9);
        peopleList.addPerson(p10);

        //Print original list
        System.out.println(peopleList.getPeopleList());
        //Print list sort by age
        System.out.println(peopleList.sortByAge());
        //Print list sort by height
        System.out.println(peopleList.sortByHeight());
    }
}
