// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//to count occ of a no in a array of int
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] ar = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i : ar) {
            set.add(i);
        }
        List<Integer> list = new ArrayList<>(set);
        System.out.println(set);
        for (int i = 0; i < list.size(); i++) {
            int c = 0;
            for (int j = i; j < ar.length; j++) {
                if (list.get(i) == ar[j]) {
                    c++;


                }
            }
            System.out.println(list.get(i) + " occured " + c + " Times");
        }
    }
}
