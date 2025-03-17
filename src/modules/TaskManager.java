package modules;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TaskManager {
    private static TaskManager instance;
    private List<Task> allTasks = new ArrayList<>();

    private TaskManager() {

    }

    public static TaskManager getInstance() {
        if(instance == null) {
            instance = new TaskManager();
        }
        return instance;
    }

    public List<Task> getAllTasks() {
        return allTasks;
    }

    public Task findTaskById(int id) {
        for(Task task : allTasks) {
            if(task.getId() == id) {
                return task;
            }
        }
        return null;
    }


    public void createTask(User assignedUser, String title, String description, Task.Priority priority) {
        Task newTask = new Task(title,description,priority,assignedUser);
        allTasks.add(newTask);
    }

    public void hideTask(int taskId) {
        Task taskToBeHidden = findTaskById(taskId);
        if (taskToBeHidden != null) {
            taskToBeHidden.hide();
        }
        else {
            System.out.println("No task found with id " + taskId);
        }
    }

    public void showTask(int taskId) {
        Task taskToBeShown = findTaskById(taskId);
        if (taskToBeShown != null) {
            taskToBeShown.show();
        }
        else{
            System.out.println("No task found with id " + taskId);
        }
    }

    public void viewTasks(boolean isAdmin) {
        if (allTasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }

        System.out.println("All tasks:");
        for (Task task : allTasks) {
            if (isAdmin || task.isTaskVisible()) { // Admin sees all, Regular sees only visible
                System.out.println("ID: " + task.getId() +
                        " | Title: " + task.getTitle() +
                        " | Description: " + task.getDescription() +
                        " | Priority: " + task.getTaskPriority() +
                        " | Assigned to: " + task.getAssignedUser().getName() +
                        " | Visible: " + (task.isTaskVisible() ? "Yes" : "No"));
            }
        }
    }


    public void updateTask(int taskId, String newTitle, String newDescription, Task.Priority newPriority) {
        for (Task task : allTasks) {
            if (task.getId() == taskId) {
                task.setTitle(newTitle);
                task.setDescription(newDescription);
                task.setTaskPriority(newPriority);
                System.out.println("Task successfully updated!");
                return;
            }
        }
        System.out.println("Task with ID " + taskId + " not found.");
    }

    public void deleteTask(int taskId) {
        Iterator<Task> iterator = allTasks.iterator();
        while (iterator.hasNext()) {
            Task task = iterator.next();
            if (task.getId() == taskId) {
                iterator.remove();
                System.out.println("Task successfully deleted!");
                return;
            }
        }
        System.out.println("Task with ID " + taskId + " not found.");
    }


    public List<Task> filterTasksByPriority(Task.Priority priority, boolean isAdmin) {
        List<Task> filteredTasks = allTasks.stream()
                .filter(task -> task.getTaskPriority() == priority)
                .toList();

        if (filteredTasks.isEmpty()) {
            System.out.println("No tasks found with priority: " + priority);
            return filteredTasks;
        }

        System.out.println("Tasks with priority " + priority + ":");
        for (Task task : filteredTasks) {
            if (isAdmin || task.isTaskVisible()) { // Admin sees all, Regular sees only visible
                System.out.println("ID: " + task.getId() +
                        " | Title: " + task.getTitle() +
                        " | Description: " + task.getDescription() +
                        " | Assigned to: " + task.getAssignedUser().getName() +
                        " | Visible: " + (task.isTaskVisible() ? "Yes" : "No"));
            }
        }
        return filteredTasks;
    }


}
