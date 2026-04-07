import java.util.ArrayList;
import java.util.Scanner;

class ToDoList {

    ArrayList<String> list = new ArrayList<>();

    void showTasks() {
        if (list.isEmpty()) {
            System.out.println("No tasks here");
        }
        else {
            for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            }
        }
    }

    void addTask() {
        Scanner newtask = new Scanner(System.in);
        String s = newtask.nextLine();
        
        list.add(s);
        list.add("");
    }

    void removeTasks() {
        Scanner remno = new Scanner(System.in);
        int no = remno.nextInt();

        list.remove(no-1);
    }
}

public class main {

    static void printlist(ArrayList menu) {
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(menu.get(i));
        }
    }

    public static void main(String[] args) {

        ToDoList TDL = new ToDoList();

        ArrayList<String> menu = new ArrayList<>();

        System.out.println("MENU");
        menu.add("1) Show Tasks");
        menu.add("2) Add Tasks");
        menu.add("3) Remove Tasks");
        menu.add("4) Exit");

        while (true) {
            printlist(menu);
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            if (choice == 1) {
                TDL.showTasks();
            }
            else if (choice == 2) {
                TDL.addTask();
            }
            else if (choice == 3) {
                TDL.removeTasks();
            }
            else if (choice == 4) {
                break;
            }
            else {
                System.out.println("invalid choice");
            }
        }
    }
}
