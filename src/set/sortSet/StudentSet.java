package set.sortSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StudentSet {
    Set<Student> studentSet;

    public StudentSet() {
        studentSet = new HashSet<>();
    }

    public void addStudent(Student student) {
        studentSet.add(student);
    }

    public void removeStudent(long id) {
        if (studentSet.isEmpty())
            throw new StudentSetException("The student set is empty");
        else
            studentSet.removeIf(s -> s.getId() == id);
    }

    public void displayStudents() {
        if (studentSet.isEmpty())
            throw new StudentSetException("The student set is empty");
        else
            studentSet.forEach(System.out::println);
    }

    public void displayStudentsByGrade() {
        Set<Student> studentsByGrade = new TreeSet<>(new studentByGrade().reversed());
        studentsByGrade.addAll(studentSet);

        if (studentsByGrade.isEmpty())
            throw new StudentSetException("The student set is empty");
        else
            studentsByGrade.forEach(System.out::println);
    }

    public void displayStudentsByName() {
        Set<Student> studentsByName = new TreeSet<>(new studentByName());
        studentsByName.addAll(studentSet);

        if (studentsByName.isEmpty())
            throw new StudentSetException("The student set is empty");
        else
            studentsByName.forEach(System.out::println);
    }
}
