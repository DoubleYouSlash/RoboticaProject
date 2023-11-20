import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class App {
    // public static void main(String[] args) {
    //     Tree tree = new Tree();
    //     Scanner in = new Scanner(System.in);
    //     int choice;
    //     System.out.println("THIS IS NOT A FAMILY TREE PROJECT I CANT DO IT THIS IS A PERSON TREE NOT A FAMILY TREE");
    //     System.out.println("Select an option:" +
    //             "\n\t1. Add a person to the tree" +
    //             "\n\t2. Show the tree" +
    //             "\n\t3. Remove someone from the tree" +
    //             "\n\t4. Show details of a specific person");
    //     choice = in.nextInt();
    //     switch (choice) {
    //         case 1:
    //             System.out.println(tree.getPrintable());
    //             for (int i = 0; i < tree.getParents().length; i++) {
    //                 if(tree.getParents()[i] == null) {
    //                     System.out.println("Seems like a parent is missing. Do you want to add one? (y/n");
    //                     char yorn = in.next().charAt(0);
    //                     if(yorn == 'y') {
    //                         tree.setParent(i, tree.getInput());
    //                     } else {
    //                         System.out.println("Select an option:" +
    //                             "\n\t1. Add a child" +
    //                             "\n\t2. Go to the next segment");
    //                         choice = in.nextInt();
    //                         switch (choice) {
    //                             case 1:
    //                                 tree.addChild(tree.getInput());
    //                                 break;
    //                             case 2:
    //                                 Tree nextTree = tree.getNext();
    //                                 break;
    //                             default:
    //                                 break;
    //                         }
    //                     }
    //                 }
    //             }
    //             break;
    //         case 2:
    //             for (int i = 0; i < tree.getChildren().size(); i++) {
    //                 System.out.println();
    //             }
    //     }
    // }
    public static void main(String[] args) {
        Tree t =  new Tree();
        for (int i = 0; i < t.getChildren().size(); i++) {
            System.out.println(t.getChildren().get(i));
            System.out.println("AAAA");
        }
    }

    
}