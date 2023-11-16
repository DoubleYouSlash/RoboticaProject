import java.util.ArrayList;

public class Branch {
    private static final int NUM_OF_PARENTS = 2;
    private Person[] parents; //index 0 = dad, index 1 = mom
    private ArrayList<Person> children;
    private ArrayList<Branch> childBranches;

    public Branch(Person[] p, ArrayList<Person> c) {
        parents = p;
        parents[0].setSpouse(parents[1]);
        parents[1].setSpouse(parents[0]);
        children = c;
        if(c != null && c.size() > 0) {
            for (int i = 0; i < c.size(); i++) {
                Person child = c.get(i);
                if(child.getChildren().size() > 0) {
                    Person[] ps;
                    ArrayList<Person> cs = new ArrayList<>();
                    for (int j = 0; j < NUM_OF_PARENTS; j++) {
                        if(child.getGender().equals(Person.getMaleGender())) {
                            ps = new Person[] {child, child.getSpouse()};
                        } else {
                            ps = new Person[] {child.getSpouse(), child};
                        }
                    }
                    for (int j = 0; j < child.getChildren().size(); j++) {
                        cs.add(child.getChildren().get(j));
                    }
                    childBranches.add(new Branch(ps, cs));
                } else {
                    childBranches.add(null);
                }
            }
        }
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
