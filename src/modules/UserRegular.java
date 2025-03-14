package modules;
import java.util.List;

public class UserRegular extends User{

    public UserRegular(int idUser, String name, String email) {
        super(idUser, name, email);
    }

    @Override
    public void viewTasks(TaskManager taskManager) {

    }
}
