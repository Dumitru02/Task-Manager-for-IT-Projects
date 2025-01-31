import java.util.ArrayList;
import java.util.List;

public class Project {
    private String name;
    private List<Task> tasks;

    public Project(String name) {
        this.name = name;
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void executeAllTasks() {
        for (Task task : tasks) {
            task.executeTask();
        }
    }

    public void showTasks() {
        for (Task task : tasks) {
            System.out.println("Task: " + task.getTitle() + ", Priority: " + task.getPriority());
        }
    }

    public String getName() {
        return name;
    }
}
