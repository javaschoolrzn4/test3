package test3.q05;

public class IntPair {
    private int a;
    private int b;
    public void setA(int i){ this.a = i; }
    public int getA(){ return this.a; }
    public void setB(int i){ this.b = i; }
    public int getB(int b){ return b; }
    public boolean equals(Object obj) {
        return ( obj instanceof IntPair && this.a == ((IntPair) obj).a && this.b ==
                ((IntPair) obj).b );
    }
    public int hashCode() {
        return 0; //1;
    }
}

/*
    Which of the following options would be valid at //1?
        Select 1 option:
        A. return a;
        B. return a*b;
        C. return a+b;
        D. return b;
       !E. All of the above are valid.
*/
