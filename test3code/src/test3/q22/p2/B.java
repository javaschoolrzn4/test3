package test3.q22.p2;

import test3.q22.p1.*;

public class B extends test3.q22.p1.A {
    public void process(A a) {
//        a.i = a.i*2;
    }
    public static void main(String[] args) {
        A a = new B();
        B b = new B();
        b.process(a);
        System.out.println( a.getI() );
    }
}

/*
    What will be the output of compiling and running class B ?
        Select 1 option:
        A. It will print 10.
        B. It will print 20.
       !C. It will not compile.
        D. It will throw an exception at Run time.
        E. None of the above.
*/