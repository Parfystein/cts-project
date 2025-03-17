package modules;

public class UserRegular extends User{

    public UserRegular(int idUser, String name, String email) {
        super(idUser, name, email);
    }

    @Override
    public void viewTasks(TaskManager taskManager) {
        taskManager.viewTasks(false);
    }


    @Override
    public void filterTasksByPriority(TaskManager taskManager, Task.Priority priority) {
        taskManager.filterTasksByPriority(priority, false);
    }

}
