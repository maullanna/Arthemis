import java.util.ArrayList;

public class ToDoList {
    private ArrayList<Task> tasks;

    public ToDoList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void showAllTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the list.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println("Task " + (i + 1) + ":");
                System.out.println(tasks.get(i));
                System.out.println("--------------------");
            }
        }
    }

    public void markTaskAsCompleted(int taskIndex) {
        if (taskIndex > 0 && taskIndex <= tasks.size()) {
            tasks.get(taskIndex - 1).markAsCompleted();
            System.out.println("Task " + taskIndex + " marked as completed.");
        } else {
            System.out.println("Invalid task index.");
        }
    }
}
