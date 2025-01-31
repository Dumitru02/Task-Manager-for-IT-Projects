public class SimpleTask extends  Task{
    public SimpleTask(String title, String description, int priority) {
        super(title, description, priority);
    }

    @Override
    public void executeTask() {
        System.out.println("Running the task: " + title);
    }
}
