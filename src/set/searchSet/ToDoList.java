package set.searchSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class ToDoList {
    Set<Task> toDoList;

    public ToDoList() {
        this.toDoList = new LinkedHashSet<>();
    }

    public void addTask(Task task) {
        toDoList.add(task);
    }

    public void removeTask(String description) {
        if (toDoList.isEmpty())
            throw new TaskException("To Do list is Empty!");
        else
            toDoList.removeIf(t -> t.getDescription().equalsIgnoreCase(description));
    }

    public void displayTasks() {
        if (toDoList.isEmpty())
            throw new TaskException("To Do list is Empty!");
        else
            toDoList.forEach(System.out::println);
    }

    public void displayFinishedTasks(){
        Set<Task> finishedTasks = new LinkedHashSet<>();

        if (toDoList.isEmpty())
            throw new TaskException("To Do list is Empty!");
        else {
            for (Task t : toDoList){
                if (t.isFinished())
                    finishedTasks.add(t);
            }
        }

        if (finishedTasks.isEmpty())
            throw new TaskException("There is no finished tasks");
        else
            finishedTasks.forEach(System.out::println);
    }

    public void displayUnfinishedTasks(){
        Set<Task> unfinishedTasks = new LinkedHashSet<>();

        if (toDoList.isEmpty())
            throw new TaskException("To Do list is Empty!");
        else {
            for (Task t : toDoList){
                if (!t.isFinished())
                    unfinishedTasks.add(t);
            }
        }

        if (unfinishedTasks.isEmpty())
            throw new TaskException("There is no unfinished tasks");
        else
            unfinishedTasks.forEach(System.out::println);
    }

    public int countTasks() {
        return toDoList.size();
    }

    public void setTaskToFinished(String description) {
        boolean taskFound = false;
        for (Task t : toDoList) {
            if (t.getDescription().equalsIgnoreCase(description)) {
                t.setFinished(true);
                taskFound = true;
                break;
            }
        }
        if (!taskFound)
            throw new TaskException("There is no task matching the description");
    }

    public void setTaskToUnfinished(String description) {
        boolean taskFound = false;
        for (Task t : toDoList) {
            if (t.getDescription().equalsIgnoreCase(description)) {
                t.setFinished(false);
                taskFound = true;
                break;
            }
        }
        if (!taskFound)
            throw new TaskException("There is no task matching the description");
    }

    public void clearToDoList(){
        toDoList.clear();
    }
}
