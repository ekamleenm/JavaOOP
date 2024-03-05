package JavaMidtermConcepts.Generics;

import JavaMidtermConcepts.Generics.GenericsAdv;

import java.util.ArrayList;
import java.util.List;

public class LetsSayIt {

    public static void main(String[] args) {
        GenericsAdv<String, String> sayBeforeItsTooLate = new GenericsAdv<>("I care about You ","Shaina ");
        sayBeforeItsTooLate.LetsDoIt();
        List<Integer> integerList = new ArrayList<>();
        integerList.add(6);
        printList(integerList); // this doesn't work : so we will use wild card by
//        putting a  ? instead of List<Objects> to List<?>
    }

    private static void printList(List<?> myList){
        System.out.println(myList.get(0));
    }
}
