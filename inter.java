// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//Intersection of two unsorted arrays
import java.util.*;
class inter {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int a[] = {1,1,2,1,4,5,6,3,3,3,3,3};
        int b[] = {3,3,2,1};
        HashSet<Integer> set= new HashSet<>();

        for(int i =0;i<b.length;i++){
            for(int j=0;j<a.length;j++){
                if(b[i]==a[j]){
                    set.add(a[j]);
                    break;
                }
                else{

                }
            }
        }
        System.out.println(set);
    }
}
