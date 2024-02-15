package SingletonClass;

public class Singleton {

    // Private : it can be called in this class only.
    private Singleton(){

    }
    private static Singleton instance;

   public static Singleton getInstance(){
       // check if 1 obj is created or not
       if(instance == null){
           instance = new Singleton();
       }
       return instance;
   }
}
