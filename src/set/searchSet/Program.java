package set.searchSet;

public class Program {
    public static void main(String[] args) {
        Task task1 = new Task("Buy groceries");
        Task task2 = new Task("Walk the dog");
        Task task3 = new Task("Do laundry");
        Task task4 = new Task("Call mom");
        Task task5 = new Task("Water the plants");
        Task task6 = new Task("Pay bills");
        Task task7 = new Task("Clean the house");
        Task task8 = new Task("Go for a run");
        Task task9 = new Task("Read a book");
        Task task10 = new Task("Write an email");

        ToDoList toDoList = new ToDoList();

        //Add tasks
        toDoList.addTask(task1);
        toDoList.addTask(task2);
        toDoList.addTask(task3);
        toDoList.addTask(task4);
        toDoList.addTask(task5);
        toDoList.addTask(task6);
        toDoList.addTask(task7);
        toDoList.addTask(task8);
        toDoList.addTask(task9);
        toDoList.addTask(task10);
        //Remove task
        toDoList.removeTask("Water the plants");
        //Display to do list
        toDoList.displayTasks();
        System.out.println();
        //Set task to finished
        toDoList.setTaskToFinished("Pay bills");
        toDoList.setTaskToFinished("Call mom");
        toDoList.setTaskToFinished("Walk the dog");
        //Display unfinished tasks
        toDoList.displayUnfinishedTasks();
        //Count tasks in to do list
        toDoList.countTasks();
        //Clear to do list
        //toDoList.clearToDoList();
    }
}
