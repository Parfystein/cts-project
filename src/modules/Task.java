package modules;

public class Task {
    private String taskTitle;
    private String taskDescription;
    private static int idCounter = 0;
    private int idTask;
    private boolean taskVisible = true;
    public enum Priority{
        LOW,
        MEDIUM,
        HIGH
    }
    private Priority taskPriority;
    private User assignedUser;


    public Task(String title, String description, Priority taskPriority, User assignedUser) {
        this.taskTitle = title;
        this.taskDescription = description;
        this.idTask = ++idCounter;
        this.taskPriority = taskPriority;
        this.assignedUser = assignedUser;
    }

    public String getTitle() {
        return taskTitle;
    }

    public void setTitle(String title) {
        this.taskTitle = title;
    }

    public String getDescription() {
        return taskDescription;
    }

    public void setDescription(String description) {
        this.taskDescription = description;
    }

    public int getId() {
        return idTask;
    }

    public boolean isTaskVisible() {
        return taskVisible;
    }

    public void hide(){
        this.taskVisible = false;
    }

    public void show(){
        this.taskVisible = true;
    }

    public Priority getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(Priority taskPriority) {
        this.taskPriority = taskPriority;
    }

    public User getAssignedUser() {
        return assignedUser;
    }
}
