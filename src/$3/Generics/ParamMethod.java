package $3.Generics;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ParamMethod {

    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(5);

        int a = getSecondElement(al1);
        System.out.println(a);

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("AB");
        al2.add("CD");
        al2.add("EF");

        String s = getSecondElement(al2);
        System.out.println(s);
    }

    private static <T> T getSecondElement(ArrayList<T> al){
        return al.get(1);
    }
}
