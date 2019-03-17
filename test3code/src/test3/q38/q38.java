package test3.q38;

public class q38 {public static void main(String[] args) {

    A obj = null;

//    obj = new A(); // true
//    obj = new B(); // true
//    obj = new C(); // false
//    obj = new D();  // false

    boolean test = (obj instanceof A) && !(obj instanceof C) && !(obj instanceof D); //1

    System.out.println(test);
}}

class A {
}
class B extends A {
}
class C extends B {
}
class D extends C {
}

/*  Given the class definitions, the expression //1
    correctly identifies whether the object referred to by obj was created by instantiating
    class B rather than classes A,C and D?

    Select 1 option:
    A.True
   !B.False
*/
