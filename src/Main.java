import modules.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        UserAdmin admin = new UserAdmin(1,"David","David@gmail.com");
        UserRegular regular= new UserRegular(2,"Alex","Alex@gmail.com");

        List<User> userList = new ArrayList<>();
        UserRegular user1= new UserRegular(3,"TestUser1","test1@gmail.com");
        userList.add(user1);
        UserRegular user2= new UserRegular(4,"TestUser2","test2@gmail.com");
        userList.add(user2);
        UserRegular user3= new UserRegular(5,"TestUser3","test3@gmail.com");
        userList.add(user3);
        UserRegular user4= new UserRegular(6,"TestUser4","test4@gmail.com");
        userList.add(user4);
        UserRegular user5= new UserRegular(7,"TestUser5","test5@gmail.com");
        userList.add(user5);

        Task task1 = new Task("TestTask1","TestDescription1", Task.Priority.LOW,user1);
        Task task2 = new Task("TestTask2","TestDescription2", Task.Priority.LOW,user2);
        Task task3 = new Task("TestTask3","TestDescription3", Task.Priority.MEDIUM,user3);
        Task task4 = new Task("TestTask4","TestDescription4", Task.Priority.MEDIUM,user4);
        Task task5 = new Task("TestTask5","TestDescription5", Task.Priority.HIGH,user5);


        User currentUser = null;
        TaskManager tsk = TaskManager.getInstance();

        tsk.addTask(task1);
        tsk.addTask(task2);
        tsk.hideTask(2);
        tsk.addTask(task3);
        tsk.addTask(task4);
        tsk.hideTask(4);
        tsk.addTask(task5);

        Scanner userInput = new Scanner(System.in);

        System.out.println("Menu: ");
        System.out.println("1 - Use admin account");
        System.out.println("2 - Use regular user account");
        System.out.println("0 - Close program");
        System.out.println("Pick an option: ");
        while(true){
            int option = userInput.nextInt();
            switch(option){
                case 1:
                    System.out.println("You are now using admin account");
                    currentUser = admin;
                    break;

                case 2:
                    System.out.println("You are now using regular user account");
                    currentUser = regular;
                    break;

                case 0:
                    System.out.println("Bye");
                    userInput.close();
                    return;
                default:
                    System.out.println("Not a valid option");
                    continue;

            }
            break;
        }

        if(currentUser instanceof UserAdmin){
            while(true){
                System.out.println("Menu: ");
                System.out.println("1 - Create task");
                System.out.println("2 - Update task");
                System.out.println("3 - Delete task");
                System.out.println("4 - Hide task");
                System.out.println("5 - Show task");
                System.out.println("6 - See all tasks");
                System.out.println("7 - See low priority tasks");
                System.out.println("8 - See medium priority tasks");
                System.out.println("9 - See high priority tasks");
                System.out.println("0 - Exit program");
                int option = userInput.nextInt();
                switch(option){
                    case 1:
                        System.out.println("Please enter the task name:");
                        String taskTitle = userInput.next();
                        System.out.println("Please enter the task description:");
                        String taskDescription = userInput.next();
                        System.out.println("Please enter the task priority (low, medium, high):");
                        String priorityInput = userInput.next().toUpperCase();
                        Task.Priority taskPriority = Task.Priority.valueOf(priorityInput);
                        System.out.println("Please choose the id of the assigned user: ");
                        for(User user : userList)
                        {
                            System.out.println(user.getIdUser() +" "+ user.getName());
                        }
                        int assignedUserId = userInput.nextInt();
                        User assignedUser = null;
                        for(User user : userList)
                        {
                            if(user.getIdUser() == assignedUserId)
                            {
                                assignedUser = user;
                            }
                        }
                        tsk.createTask(assignedUser, taskTitle, taskDescription, taskPriority);
                        break;

                    case 2:
                        //TODO show all tasks here
                        System.out.println("Which task would you like to modify?");
                        int taskToModify = userInput.nextInt();
                        System.out.println("Please enter the task name:");
                        String newTaskTitle = userInput.next();
                        System.out.println("Please enter the task description:");
                        String newTaskDescription = userInput.next();
                        System.out.println("Please enter the task priority (low, medium, high):");
                        String newPriorityInput = userInput.next().toUpperCase();
                        Task.Priority newTaskPriority = Task.Priority.valueOf(newPriorityInput);
                        tsk.updateTask(taskToModify,newTaskTitle,newTaskDescription,newTaskPriority);
                        break;

                    case 3:
                        //TODO show all tasks here
                        System.out.println("Which task would you like to delete?");
                        int taskToDelete = userInput.nextInt();
                        tsk.deleteTask(currentUser,taskToDelete);
                        break;

                    case 4:
                        //TODO show all tasks here
                        System.out.println("Which task would you like to hide?");
                        int taskToHide = userInput.nextInt();
                        tsk.hideTask(taskToHide);
                        break;

                    case 5:
                        //TODO show all tasks here
                        System.out.println("Which task would you like to make visible?");
                        int taskToShow = userInput.nextInt();
                        tsk.showTask(taskToShow);
                        break;

                    case 6:
                        tsk.viewTasks(currentUser);
                        break;

                    case 7:
                        //TODO show the low priority tasks
                        break;

                    case 8:
                        //TODO show the medium priority tasks
                        break;

                    case 9:
                        //TODO show the high priority tasks
                        break;

                    case 0:
                        System.out.println("Bye");
                        userInput.close();
                        return;
                    default:
                        System.out.println("Not a valid option");
                        continue;

                }
            }
        }
        else if(currentUser instanceof UserRegular){
            while(true){
                System.out.println("Menu: ");
                System.out.println("1 - Create task");
                System.out.println("2 - Update task");
                System.out.println("3 - See all tasks");
                System.out.println("4 - See low priority tasks");
                System.out.println("5 - See medium priority tasks");
                System.out.println("6 - See high priority tasks");
                System.out.println("0 - Exit program");
                int option = userInput.nextInt();
                switch(option){
                    case 1:
                        System.out.println("Please enter the task name:");
                        String taskTitle = userInput.next();
                        System.out.println("Please enter the task description:");
                        String taskDescription = userInput.next();
                        System.out.println("Please enter the task priority (low, medium, high):");
                        String priorityInput = userInput.next().toUpperCase();
                        Task.Priority taskPriority = Task.Priority.valueOf(priorityInput);
                        System.out.println("Please choose the id of the assigned user: ");
                        for(User user : userList)
                        {
                            System.out.println(user.getIdUser() +" "+ user.getName());
                        }
                        int assignedUserId = userInput.nextInt();
                        User assignedUser = null;
                        for(User user : userList)
                        {
                            if(user.getIdUser() == assignedUserId)
                            {
                                assignedUser = user;
                            }
                        }
                        tsk.createTask(assignedUser, taskTitle, taskDescription, taskPriority);
                        break;

                    case 2:
                        //TODO show all tasks here
                        System.out.println("Which task would you like to modify?");
                        int taskToModify = userInput.nextInt();
                        System.out.println("Please enter the task name:");
                        String newTaskTitle = userInput.next();
                        System.out.println("Please enter the task description:");
                        String newTaskDescription = userInput.next();
                        System.out.println("Please enter the task priority (low, medium, high):");
                        String newPriorityInput = userInput.next().toUpperCase();
                        Task.Priority newTaskPriority = Task.Priority.valueOf(newPriorityInput);
                        tsk.updateTask(taskToModify,newTaskTitle,newTaskDescription,newTaskPriority);
                        break;

                    case 3:
                        tsk.viewTasks(currentUser);
                        break;

                    case 4:
                        List<Task> lowPriorityTasks = tsk.filterTasksByPriority(Task.Priority.LOW,currentUser);
                        for(Task task : lowPriorityTasks)
                        {
                            System.out.println(task.toString());
                        }
                        break;

                    case 5:
                        //TODO show the medium priority tasks
                        break;

                    case 6:
                        //TODO show the high priority tasks
                        break;

                    case 0:
                        System.out.println("Bye");
                        userInput.close();
                        return;
                    default:
                        System.out.println("Not a valid option");
                        continue;

                }
            }
        }


    }


}

