package test3.q03;

interface A{
    static void m1(){};
}
interface AA extends A{
    void m2();
}
interface AAA extends AA{
    void m3();
}
interface B {
    default void m1(){ }
}
interface BB extends B {
    static void m2(){ };
}
interface C extends BB{
    void m3();
}

/*
Which of the interface definitions can be implemented using Lambda expressions?

Select 2 options:
        A. A
       !B. AA
        C. AAA
        D. B
        E. BB
       !F. C
*/
