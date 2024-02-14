package JavaOOP;
// Wrapper class
public class Demo_2{
    public static void main(String[] args) {
        int a = 10;    // Primitive data types are in stack so there is no pass by reference, therefore copies get passed
        Integer num = 10;  // Object: are in heap their reference value is passed i.e. num is copied and passed and num
                           // nnum is refernce var, Here Integer is FINAL so that why it wont be swapped but in general
                          // have thier address passed unlike primitive data types.
    }
}                         // FINAL doesn't work on objects. It can only stop the reference var from being resigned to
                          // other object.