package modules;
import java.util.List;

public class UserAdmin extends User{

    public UserAdmin(int idUser, String name, String email) {
        super(idUser, name, email);
    }

    @Override
    public void viewTasks(TaskManager taskManager) {

    }
}
