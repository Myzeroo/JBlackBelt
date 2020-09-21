package $3.Generics;

public class ParamClass {
    public static void main(String[] args) {
        NewParam<String> Np1 = new NewParam<>("Hello");
        System.out.println(Np1.toString());
        String s1 = Np1.getValue();

        NewParam<Integer> Np2 = new NewParam<>(13);
        System.out.println(Np2.toString());
        Integer s2 = Np2.getValue();

        Pair<String, Integer> pr1 = new Pair<>("Privet", 18);
        System.out.println("Znacheniya " + pr1.getVal1() + " " + pr1.getVal2());

    }
}
// <E> element <K> key <V> value <T> type place holder
class NewParam<T>{
    private T val; // переменная Т типа не может быть статической т.к. ее тип не определен.
    private T val2; // если 2 переменных должны быть одного типа
    NewParam (T val){
        this.val=val;
    }
    public String toString(){
        return "<{( " + val + " )}>";
    }
    public T getValue(){
        return val;
    }
}

class Pair<V1,V2>{
    private V1 val1;
    private V2 val2;

    public Pair(V1 val1, V2 val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public V1 getVal1() {
        return val1;
    }

    public V2 getVal2() {
        return val2;
    }
}