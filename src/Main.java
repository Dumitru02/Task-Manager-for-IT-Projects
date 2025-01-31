import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner my_scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        while (true) {
            try {
                System.out.println("\n1. Add project");
                System.out.println("2. Add task to a project");
                System.out.println("3. Display projects");
                System.out.println("4. Display tasks for a project");
                System.out.println("5. Execute all tasks of a project");
                System.out.println("6. Exit");
                System.out.print("Choose an option: ");
                int option = Integer.parseInt(my_scanner.nextLine());

                switch (option) {
                    case 1:
                        System.out.print("Project name: ");
                        String projectName = my_scanner.nextLine().trim();
                        if (projectName.isEmpty()) {
                            System.out.println("The project name cannot be empty!");
                            break;
                        }
                        taskManager.addProject(new Project(projectName));
                        break;
                    case 2:
                        System.out.print("Project name: ");
                        projectName = my_scanner.nextLine().trim();
                        Project project = taskManager.getProject(projectName);
                        if (project == null) {
                            System.out.println("Project does not exist!");
                            break;
                        }
                        System.out.print("Task title: ");
                        String title = my_scanner.nextLine().trim();
                        System.out.print("Task description: ");
                        String description = my_scanner.nextLine().trim();
                        System.out.print("Priority (1-5): ");
                        int priority = Integer.parseInt(my_scanner.nextLine().trim());
                        if (priority < 1 || priority > 5) {
                            System.out.println("Priority must be between 1 and 5!");
                            break;
                        }
                        System.out.print("Task type (1 - Simple, 2 - BugFix): ");
                        int type = Integer.parseInt(my_scanner.nextLine().trim());
                        if (type == 1) {
                            project.addTask(new SimpleTask(title, description, priority));
                        } else if (type == 2) {
                            project.addTask(new BugFixTask(title, description, priority));
                        } else {
                            System.out.println("Invalid type!");
                        }
                        break;
                    case 3:
                        taskManager.showAllProjects();
                        break;
                    case 4:
                        System.out.print("Project name: ");
                        projectName = my_scanner.nextLine().trim();
                        project = taskManager.getProject(projectName);
                        if (project == null) {
                            System.out.println("Project does not exist!");
                            break;
                        }
                        project.showTasks();
                        break;
                    case 5:
                        System.out.print("Project name: ");
                        projectName = my_scanner.nextLine().trim();
                        project = taskManager.getProject(projectName);
                        if (project == null) {
                            System.out.println("Project does not exist!");
                            break;
                        }
                        project.executeAllTasks();
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        my_scanner.close();
                        return;
                    default:
                        System.out.println("Invalid option!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid number!");
            }
        }

        // end of main
    }

}
