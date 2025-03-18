package modules;

public class UserAdmin extends User{

    public UserAdmin(int idUser, String name, String email) {
        super(idUser, name, email);
    }

    @Override
    public void viewTasks(TaskManager taskManager) {
        taskManager.viewTasks(this);
    }


    public void updateTask(TaskManager taskManager, int taskId, String newTitle, String newDescription, Task.Priority priority) {
        taskManager.updateTask(taskId, newTitle, newDescription, priority);
    }

    public void deleteTask(TaskManager taskManager, int taskId) {
        taskManager.deleteTask(this, taskId);
    }

    @Override
    public void filterTasksByPriority(TaskManager taskManager, Task.Priority priority) {
        taskManager.filterTasksByPriority(priority, this);
    }


}
