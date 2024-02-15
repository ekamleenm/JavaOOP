package staticExample;

public  class InnerClass {
   // we are using static class b/c we don't want to create objects
   // of InnerClass in order to access Test class
   static class Test{
       String name;
        public Test(String s){
            this.name = s;
        }

       public static void main(String[] args) {
            // we accessed the Test class without
            Test a = new Test("shaina");
            Test b = new Test("Ekam");
           System.out.println(a.name);
           System.out.println(b.name);
       }
    }
}
