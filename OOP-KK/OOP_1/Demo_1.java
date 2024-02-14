package JavaOOP;

public class Demo_1 {

    public static void main(String[] args) {
        // Data of  5 Students : {roll,name,gpa}
        Student[] listStud = new Student[5];
        Student st1 = new Student(21, "Shaina", 4);
        listStud[0] = st1;
        System.out.println(listStud[0].getName());
        st1.greeting();
        st1.changeName("Shaina Gill");
        st1.greeting();
        Student st2 = new Student();
        st2.greeting();

        // Reference Vars Pointing to same objects:
        Student one = new Student();
        Student two = one;

        one.changeName("CoolName");
        System.out.println(two.getName()); // We changed name of one, but along with it two also changes
    }
}


// Inorder to create objects: we need to use "new" variable.
// Constructors : to instantiate the objects of a class.
// new Student() ; By default Cosntructor.

// Create Class
class Student {
    private int roll;
    private String name;
    private float gpa;

    // Default Const
    public Student(){
        this.name = "ABC";
        this.roll = 1;
        this.gpa = 0.0f;
    }

    public Student(int roll, String name, float gpa) {
        this.roll = roll;
        this.name = name;
        this.gpa = gpa;
    }
    // Methods in class Student:
    public String getName() {
        return name;
    }
    void greeting(){
        System.out.println("Hello! I am " + this.name);
    }
    void changeName(String newName){
        this.name = newName;
    }

}