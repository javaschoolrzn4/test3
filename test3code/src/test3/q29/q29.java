package test3.q29;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class q29 {
    public static void main(String[] args) {
        Stream<Integer> values = IntStream.rangeClosed(10, 15).boxed(); //1
        Object obj = values.collect(Collectors.partitioningBy(x->x%2==0)); //2
        System.out.println(obj);
    }
}

/* What will the following code print when compiled and run?

        Select 1 option:
        A. Compilation error at //1
        B. Compilation error at //2
        C. {[11, 13, 15], [10, 12, 14]}
        D. [[11, 13, 15], [10, 12, 14]]
       !E. {false=[11, 13, 15], true=[10, 12, 14]}
*/
