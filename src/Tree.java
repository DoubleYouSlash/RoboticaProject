import java.util.ArrayList;
import java.util.Scanner;

public class Tree {

    private ArrayList<Tree> childrenTrees;
    private ArrayList<Person> children;
    private Person[] parents;

    public Tree(Person m, Person d, ArrayList<Person> c, ArrayList<Tree> ct) {
        parents = new Person[] { d, m };
        children = c;
        childrenTrees = ct;
    }

    public Tree(Person[] p, ArrayList<Person> c, ArrayList<Tree> ct) {
        parents = p;
        children = c;
        childrenTrees = ct;
    }

    public Tree() {
        parents = new Person[2];
        children = new ArrayList<>();
    }

    public void addChild(Person child) {
        children.add(child);
        
        int childIndex = children.indexOf(child);
        Tree childTree = new Tree();
        childTree.setParents(new Person[] { child, child.getSpouse() });
        for (int i = 0; i < child.getChildren().size(); i++) {
            childTree.addChild(child.getChildren().get(i));
        }
        childrenTrees.set(childIndex, childTree);
    }

    public ArrayList<Person> getChildren() {
        return this.children;
    }

    public void setChildren(ArrayList<Person> children) {
        this.children = children;
    }

    public Person[] getParents() {
        return this.parents;
    }

    public void setParents(Person[] parents) {
        this.parents = parents;
    }

    public ArrayList<Tree> getChildrenTrees() {
        return childrenTrees;
    }

    public void setChildrenTrees(ArrayList<Tree> childrenTrees) {
        this.childrenTrees = childrenTrees;
    }

    public String getPrintable() {
        String res = "";
        res += parents[0] + " ------- " + parents[1];
        res += "\n";
        for (int i = 0; i < children.size(); i++) {
            res += children.get(i);
            if (i != children.size() - 1) {
                res += " --- ";
            }
        }
        return res;
    }

    public Person getInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name");
        String name = in.next();
        System.out.println("Enter age");
        int age = in.nextInt();
        return new Person(name, age);
    }

    public void addParent(Person p) {
        if(parents[0] == null) {
            parents[0] = p;
        } else {
            parents[1] = p;
        }
    }

}
