package test3.q18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class q18 {
    public static void main(String[] args) {
        ArrayList<Integer> source = new ArrayList<Integer>();
        source.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<Integer> destination =
                Collections.synchronizedList(new ArrayList<Integer>());
        source
                .parallelStream() //1
                .peek(item->{destination.add(item); }) //2
                .forEachOrdered(System.out::print);
        System.out.println("");
        destination
                .stream() //3
                .forEach(System.out::print); //4
        System.out.println("");

        /*
        What changes must be made to the above code so that it will consistently print
        123456
        123456
                ?
                Select 1 option:
       !A. Replace code at //1 with
                .stream()
        B. Replace code at //2 with
                .map(item->{destination.add(item); return item; })
        C. Replace code at //3 with
                .parallelStream()
        D. Replace code at //4 with
                .forEachOrdered(System.out::print);
        */
    }
}
