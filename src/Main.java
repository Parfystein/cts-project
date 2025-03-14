import modules.Task;
import modules.TaskManager;
import modules.UserAdmin;
import modules.UserRegular;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        UserAdmin test1 = new UserAdmin(1,"David","David@gmail.com");
        UserRegular test2= new UserRegular(2,"Alex","Alex@gmail.com");


//        Scanner userInput = new Scanner(System.in);
//
//        while(true){
//            System.out.println("Menu: ");
//            System.out.println("1 - Use admin account");
//            System.out.println("2 - Use user account");
//            System.out.println("0 - Close program");
//
//            System.out.println("Pick an option: ");
//            int option = userInput.nextInt();
//
//            switch(option){
//                case 1:
//                    System.out.println("You are now using admin account");
//                    //TODO: Admin logic testing
//                    break;
//
//                case 2:
//                    System.out.println("You are now using user account");
//                    //TODO: Normal user logic testing
//                    break;
//
//                case 0:
//                    System.out.println("Bye");
//                    userInput.close();
//                    return;
//                default:
//                    System.out.println("Not a valid option");
//            }
//        }
//    }
//
//    public static void adminMenu(Scanner userInput){
//        while (true) {
//            System.out.println("\nAdmin Menu:");
//            System.out.println("1 - Modify task");
//            System.out.println("2 - Delete task");
//            System.out.println("3 - Create task");
//            System.out.println("4 - Hide task");
//            System.out.println("5 - Unhide task");
//            System.out.println("6 - View tasks");
//            System.out.println("7 - Filter tasks by priority");
//            System.out.println("0 - Exit program");
//
//            System.out.print("Pick an option: ");
//            int option = userInput.nextInt();
//
//            switch (option) {
//                case 1:
//                    System.out.println("Displaying system logs...");
//                    // TODO: Implement log viewing logic
//                    break;
//                case 2:
//                    System.out.println("Managing users...");
//                    // TODO: Implement user management logic
//                    break;
//                case 0:
//                    return; // Go back to the main menu
//                default:
//                    System.out.println("Not a valid option, please try again.");
//            }
//        }

   }
}

