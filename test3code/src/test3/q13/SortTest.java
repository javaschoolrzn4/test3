package test3.q13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person{
    String name;
    String dob;
    public Person(String name, String dob){
        this.name = name; this.dob = dob;
    }
}
public class SortTest {
    public static void main(String[] args) {
        ArrayList<Person> al = new ArrayList<>();
        al.add(new Person("Paul", "01012000"));
        al.add(new Person("Peter", "01011990"));
        al.add(new Person("Patrick", "01012002"));
//    What can be inserted in the code so that it will sort the collection of Persons by Person's dob attribute?
//        Select 1 option:
//  A.
//        Collections.sort(al, new Comparable<Person>(){
//            public int compare(Person o1, Person o2) {
//                return o1.dob.compareTo(o2.dob);
//            }
//        });

// !B.
//        Collections.sort(al, new Comparator<Person>(){
//            public int compare(Person o1, Person o2) {
//                return o1.dob.compareTo(o2.dob);
//            }
//        });

//  C.
//        Collections.sort(al, new Comparable<Person>(){
//            public int compare(Person o1, Person o2) {
//                return o1.dob.compare(o2.dob);
//            }
//        });

//  D.
//        Collections.sort(al, new Comparator<Person>(){
//            public int compare(Person o1, Person o2) {
//                return o1.dob.compare(o2.dob);
//           }
//        });

        for(Person a : al) System.out.println(a.name+" "+ a.dob);
    }
}


