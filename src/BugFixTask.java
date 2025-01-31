public class BugFixTask extends Task {


    public BugFixTask(String title, String description, int priority) {
        super(title, description, priority);
    }

    @Override
    public void executeTask() {
        System.out.println("Bug fix: " + title);
    }
}
