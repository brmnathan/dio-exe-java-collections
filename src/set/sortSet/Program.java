package set.sortSet;

public class Program {
    public static void main(String[] args) {
        StudentSet studentSet = new StudentSet();

        //Add students
        studentSet.addStudent(new Student("Harry Potter", 12345678, 8.5));
        studentSet.addStudent(new Student("Hermione Granger", 23456789, 9.2));
        studentSet.addStudent(new Student("Ron Weasley", 34567890, 7.8));
        studentSet.addStudent(new Student("Ginny Weasley", 45678901, 8.7));
        studentSet.addStudent(new Student("Luna Lovegood", 56789012, 9.1));
        studentSet.addStudent(new Student("Neville Longbottom", 67890123, 7.9));
        studentSet.addStudent(new Student("Draco Malfoy", 78901234, 7.5));
        studentSet.addStudent(new Student("Cho Chang", 89012345, 8.7));
        studentSet.addStudent(new Student("Cedric Diggory", 90123456, 9.0));
        studentSet.addStudent(new Student("Fleur Delacour", 11223344, 8.4));
        //remove student
        studentSet.removeStudent(90123456);
        //Display by Name
        studentSet.displayStudentsByName();
        System.out.println();
        //Display by Grade
        studentSet.displayStudentsByGrade();

    }
}
