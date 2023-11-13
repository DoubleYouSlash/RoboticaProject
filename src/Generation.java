import java.util.ArrayList;

public class Generation {
    private Person root;
    private ArrayList<Person> children;

    public Generation(Person r, ArrayList<Person> c) {
        root = r;
        children = c;
    }

    public void add(Person child) {
        children.add(child);
    }

    public ArrayList<Person> getChildren() {
        return children;
    }

    public Person getRoot() {
        return root;
    }
    
    public void setChildren(ArrayList<Person> children) {
        this.children = children;
    }

    public void setRoot(Person root) {
        this.root = root;
    }
}
