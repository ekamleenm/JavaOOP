package JavaMidtermConcepts.ObserverPattern;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("");
        MyFile core = new MyFile("core", root);

        // Create observer for file core
        FileObserver obs = new FileObserver(core);
        core.write("hello");
        core.write("world");
    }
}