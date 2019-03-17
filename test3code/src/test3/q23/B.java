package test3.q23;

class A {
    A() { print(); }
    private void print() { System.out.println("A"); }
}

class B extends A {
    int i = Math.round(3.5f);
    void print() { System.out.println(i); }
    public static void main(String[] args) {
        A a = new B();
//        a.print();
    }
}

/*
    What will be the output when class B is run ?
        Select 1 option:
        A. It will print A, 4.
        B. It will print A, A
        C. It will print 0, 4
        D. It will print 4, 4
       !E. None of the above.
*/