public class Tree {
    private Branch gen;

    public Tree(Branch g) {
        gen = g;
    }
    public Tree() {
        gen = null;
    }

    public Branch getGeneration() {
        return gen;
    }

    public void setGeneration(Branch g) {
        this.gen = g;
    }
    
}