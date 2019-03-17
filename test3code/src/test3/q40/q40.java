package test3.q40;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class q40 {
    public static void main(String[] args) {

//    Identify the valid for loop constructs assuming the following declarations:
        Object o = null;
        Collection c = Arrays.asList("1", "2", "3", "4");//valid collection object.

        int[][] ia = {{1,2},{3,4}};//valid array
//        Select 2 options:
//        A.
//        for(o : c){ }
//       !B.
        for(final Object o2 :c){ }
//        C.
//        for(int i : ia) { }
//        D.
//        for(Iterator it : c.iterator()){ }
//       !E.
//        for(int i : ia[0]){ }
    }
}

