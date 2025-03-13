package modules;
import java.util.List;

public class UserRegular extends User{

    public UserRegular(int idUser, String name, String email, List<Task> tasksList) {
        super(idUser, name, email, tasksList);
    }

}
