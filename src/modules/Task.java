package modules;

public class Task {
    private String title;
    private String description;
    private static int idCounter = 0;
    private int idTicket;
    private boolean taskVisible = true;
    public enum Priority{
        LOW,
        MEDIUM,
        HIGH
    }
    private Priority taskPriority;


    public Task(String title, String description, Priority taskPriority) {
        this.title = title;
        this.description = description;
        this.idTicket = ++idCounter;
        this.taskPriority = taskPriority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return idTicket;
    }

    public boolean isTaskVisible() {
        return taskVisible;
    }

    public void setTaskVisible(boolean taskVisible) {
        this.taskVisible = taskVisible;
    }

    public Priority getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(Priority taskPriority) {
        this.taskPriority = taskPriority;
    }
}
