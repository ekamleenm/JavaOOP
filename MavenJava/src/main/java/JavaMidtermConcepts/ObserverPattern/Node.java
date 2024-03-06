package JavaMidtermConcepts.ObserverPattern;

public class Node {
    private String name;
    private Directory parent;

    public Node(String name, Directory parent) {
        this.name = name;
        this.parent = parent;
    }

    public String getAbsoluteName() {
        return parent.getPath() + "/" + name;
    }
}
