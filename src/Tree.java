import java.util.ArrayList;
import java.util.Scanner;

public class Tree {
    private ArrayList<Tree> childTrees; //index of child = index of child tree
    private Person[] parents;
    private ArrayList<Person> children;

    public Tree(ArrayList<Tree> childTrees, Person[] parents, ArrayList<Person> children) {
        this.childTrees = childTrees;
        this.parents = parents;
        this.children = children;
    }

    public Tree() {
        parents = new Person[2];
        childTrees = new ArrayList<>();
        children = new ArrayList<>();
    }

    public Tree getNext() {
        return next;
    }

    public void setNext(Tree next) {
        this.next = next;
    }

    public Person[] getParents() {
        return parents;
    }

    public void setParents(Person[] parents) {
        this.parents = parents;
    }

    public void setParent(int i, Person p) {
        parents[i] = p;
    }

    public ArrayList<Person> getChildren() {
        return children;
    }

    public void addChild(Person c) {
        children.add(c);
    }

    public void setChildren(ArrayList<Person> children) {
        this.children = children;
    }

    public String getPrintable() {
        String res = "";
        for (int i = 0; i < parents.length; i++) {
            if (parents[i] != null) {
                res += parents[i].toString();
                if (i != parents.length - 1) {
                    res += " ------- ";
                }
            }

        }
        char space = 32;
        for (int i = 0; i < parents[0].toString().length() + 3; i++) {
            res += space;
        }
        res += "|";
        res += "\n";
        for (int i = 0; i < parents[0].toString().length() + 3; i++) {
            res += space;
        }
        res += "V\n";
        for (int i = 0; i < children.size(); i++) {
            res += children.get(i).toString();
            if (i != children.size() - 1) {
                res += " --- ";
            }
        }
        return res;
    }

    public Person getInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input name");
        String name = in.nextLine();
        System.out.println("Input age");
        int age = in.nextInt();
        System.out.println("Input gender (m/f)");
        String gender = in.next();
        gender = gender.equals(Person.getMaleGender()) ? Person.getMaleGender() : Person.getFemaleGender();
        return new Person(name, age, gender);
    }

}