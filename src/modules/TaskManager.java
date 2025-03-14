package modules;

import java.util.ArrayList;
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



}
