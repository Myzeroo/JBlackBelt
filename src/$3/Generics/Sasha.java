package $3.Generics;

public class Sasha {
    public static void main(String[] args) {

        System.out.println("Задание №7: ");
        int[] array7 = {0, 1, 2, 3, 4};
        int n = 1;
        int el;

        while (n >= array7.length) {
            n -= array7.length;
        }
        for (int k = 1; k <= n; k++) {
            for (int i = 0; i < array7.length - 1; i++) {
                el = array7[i + 1];
                array7[i + 1] = array7[0];
                array7[0] = el;
            }
        }
        for (int i = 0; i < array7.length; i++) {
            System.out.print(array7[i] + " ");
        }
    }
}
