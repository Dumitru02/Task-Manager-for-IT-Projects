import java.util.HashMap;
import java.util.Map;

public class TaskManager {
    private Map<String, Project> projects;

    public TaskManager() {
        this.projects = new HashMap<>();
    }

    public void addProject(Project project) {
        projects.put(project.getName(), project);
    }

    public void showAllProjects() {
        for (String projectName : projects.keySet()) {
            System.out.println("Project: " + projectName);
        }
    }

    public Project getProject(String name) {
        return projects.get(name);
    }
}
