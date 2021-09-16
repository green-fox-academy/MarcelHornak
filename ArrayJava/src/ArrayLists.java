import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();

        System.out.println(myList.size());

        myList.add("Filip");
        myList.add("Igor");
        myList.add("Joga");

        System.out.println(myList.size());

        System.out.println(myList);

        myList.add(2, "Pavol");
        System.out.println(myList);

        myList.set(2, "Patrik");
        System.out.println(myList);

        myList.remove(2);
        System.out.println(myList);

        myList.add("Patrik");
        myList.add("Patrik");
        myList.add("Patrik");
        System.out.println(myList);
        myList.remove("Patrik");
        myList.remove("Patrik");
        myList.remove("Patrik");
        System.out.println(myList);

        System.out.println(myList.get(1));

        System.out.println(myList.contains("Joga"));

        ArrayList<String> newArrList = new ArrayList<>();
        newArrList.add("Igor");
        newArrList.add("Joga");
        System.out.println(myList.containsAll(newArrList));

        newArrList.clear();
        System.out.println(newArrList.size());

        System.out.println(myList.isEmpty());

        myList.add(0, "Pavol");
        System.out.println(myList);
        Collections.sort(myList);
        System.out.println(myList);

        // ARRAY -> (ARRAY)LIST
        String[] a = {"a", "b", "c"};
        List<String> strArr = Arrays.asList(a);
        System.out.println(strArr);

        // (ARRAY)LIST -> ARRAY
        String[] na = new String[strArr.size()];
        strArr.toArray(na);

        System.out.println(na.length);
        for(String s : na){
            System.out.println(s);
        }
    }
}