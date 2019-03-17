package test3.q34;

import java.util.*;
public class WaitTest {
    static boolean sorted = false;
    public static void main(String[] args) {
        new AnotherThread(args).start(); //1
        synchronized (args) {
            try {
                while(!sorted){
                    args.wait();
                }
            } catch (InterruptedException e) { }
            List<String> m = Arrays.asList(args);
            System.out.println(m);
        }
    }
}
class AnotherThread extends Thread {
    String[] args;
    AnotherThread(String[] sa) {
        args = sa;
    }
    public void run() {
        synchronized (args) {
            List<String> m = Arrays.asList(args);
            Collections.sort(m);
            WaitTest.sorted = true;
            args.notifyAll();
        }
    }
}


/*

What will happen when the class WaitTest is run using the command line:
java WaitTest a c b

Select 2 options:
!A. It WILL print [a, b, c].
 B. It MAY print [a, c, b].
 C. It MAY print nothing.
!D. It will NEVER print [a, c, b].
 E. It will not compile.
 F. It may print the elements of the args array in any order.
 G. It will throw an exception at runtime.

*/