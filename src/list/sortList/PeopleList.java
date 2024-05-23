package list.sortList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PeopleList {
    private final List<Person> peopleList;

    public PeopleList() {
        this.peopleList = new ArrayList<>();
    }

    public List<Person> getPeopleList() {
        return peopleList;
    }

    public void addPerson(Person person) {
        peopleList.add(person);
    }

    public List<Person> sortByAge() {
        List<Person> peopleByAge = new ArrayList<>(peopleList);
        if (peopleList.isEmpty())
            throw new PeopleListException("The list is empty");
        else {
            Collections.sort(peopleByAge);
            return peopleByAge;
        }
    }

    public List<Person> sortByHeight() {
        List<Person> peopleByHeight = new ArrayList<>(peopleList);
        if (peopleList.isEmpty())
            throw new PeopleListException("The list is empty");
        else {
            peopleByHeight.sort(new comparatorByHeight());
            return peopleByHeight;
        }
    }
}
