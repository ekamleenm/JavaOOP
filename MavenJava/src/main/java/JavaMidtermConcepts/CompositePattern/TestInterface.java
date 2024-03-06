package JavaMidtermConcepts.CompositePattern;

public class TestInterface {
    public static void main(String[] args) {
        Employee CEO = new Employee("John", "CEO", 30000);
        Employee headSales = new Employee("ekam", "Head Saels", 4000);
        CEO.add(headSales);
    }
}
