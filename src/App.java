import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Person> tree = new ArrayList<Person>();
        Scanner in = new Scanner(System.in);
        int choice;
        System.out.println("Select an option:" +
                "\n\t1. Add a person to the tree" +
                "\n\t2. Show the tree" +
                "\n\t3. Remove someone from the tree");
        choice = in.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Input name");
                String name = in.nextLine();
                System.out.println("Input age");
                int age = in.nextInt();
                tree.add(new Person(name, age));
                break;
            case 2:
                for (int i = 0; i < tree.size(); i++) {
                    System.out.println();
                }
        }
    }
}