package test3.q12;

import java.util.ArrayDeque;
import java.util.Deque;

public class q12 {

    public static void main(String[] args) {
//        What will be the contents of d at the end of the following code?
        Deque<Integer> d = new ArrayDeque<>();
        d.add(1);
//        System.out.println(d);
        d.push(2);
//        System.out.println(d);
        d.pop();
//        System.out.println(d);
        d.offerFirst(3);
//        System.out.println(d);
        d.remove();
        System.out.println(d);
/*
        Select 1 option:
       !A. 1
        B. 2
        C. 3
        D. Exception at run time.
        E. It will not compile.
*/
    }
}
