package JavaMidtermConcepts.ObserverPattern;

public class FileObserver implements Observer {
    private MyFile subject;

    public FileObserver(MyFile file) {
        file.attach(this);
        subject = file;
    }

    public void update() {
        System.out.println("File " + subject.getAbsoluteName() + " has changed.");
    }
}