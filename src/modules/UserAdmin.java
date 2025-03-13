package modules;
import java.util.List;

public class UserAdmin extends User{

    public UserAdmin(int idUser, String name, String email, List<Task> tasksList) {
        super(idUser, name, email, tasksList);
    }

}
