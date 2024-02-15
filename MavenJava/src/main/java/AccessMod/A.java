package AccessMod;
/*
Default Access Modifier: Package we can but not in other package.
Default is more strict than protected
protected : Can be accessed in diff package, only in subclass
Defualt : just in the same package, not even if we have subclass in
diff package.
*/
public class A {
    private int num;
    private String name;
    private int[] arr;


    public A(int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

    public void setNum(int num) {
        this.num = num;
    }
    public int getNum() {
        return num;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return  this.name;
    }
}
