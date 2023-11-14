import java.util.ArrayList;

public class Branch {
    private static final int NUM_OF_PARENTS = 2;
    private Person[] parents; //index 0 = dad, index 1 = mom
    private ArrayList<Person> children;


    public Branch(Person[] r, ArrayList<Person> c) {
        parents = r;
        parents[0].setSpouse(parents[1]);
        parents[1].setSpouse(parents[0]);
        children = c;
    }

    public Branch(ArrayList<Person> c) {
        parents = new Person[NUM_OF_PARENTS];
        children = c;
    }

    public Branch() {
        parents = null;
        children = null;
    }

    public void addParentDad(Person p) {
        parents[0] = p;
    }

    public void addParentMom(Person p) {
        parents[1] = p;
    }

    public void add(Person child) {
        children.add(child);
    }

    public void remove(Person child) {
        children.remove(child);
    }

    public ArrayList<Person> getChildren() {
        return children;
    }

    public Person[] getParents() {
        return parents;
    }
    
    public void setChildren(ArrayList<Person> children) {
        this.children = children;
    }

    public void setParents(Person[] root) {
        this.parents = root;
    }
}
