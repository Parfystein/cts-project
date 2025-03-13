package modules;

import java.util.List;

public class User {
    private int idUser;
    private String name;
    private String email;
    private List<Task> tasksList;

    public User(int idUser, String name, String email, List<Task> tasksList) {
        this.idUser = idUser;
        this.name = name;
        this.email = email;
        this.tasksList = tasksList;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Task> getTasksList() {
        return tasksList;
    }

    public void setTasksList(List<Task> tasksList) {
        this.tasksList = tasksList;
    }

}
