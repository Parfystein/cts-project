import modules.Task;

public class Main
{
    public static void main(String[] args)
    {
        Task task1 = new Task("Test1", "test");
        Task task2 = new Task("Test2", "test");
        Task task3 = new Task("Test3", "test");
        System.out.println(task1.getId() + " " + task2.getId() + " " + task3.getId());
    }

}
