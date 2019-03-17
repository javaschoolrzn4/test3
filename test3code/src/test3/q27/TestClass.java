package test3.q27;

import java.io.Serializable;

class Bond {
    String ticker; double coupon; java.util.Date maturity;
}

class Portfolio implements Serializable {
    String accountName;
    Bond[] bonds;
}

public class TestClass {
    public static void main(String[] args) throws Exception{
        Portfolio portfolio = new Portfolio();// get portfolio somehow.
        // serialize portfolio
    }
}

/*
    Which of the following approaches can be taken independent of each other so that a Portfolio object
    can be serialized while preserving the state of the Bond objects contained in Portfolio?
        Select 2 options:
    A. It can be serialized as it is without any modification.
   !B. Just have Bond class implement Serializable.
    C. Just make 'bonds' field in Portfolio transient.
    D. Change the type of bonds from Bond[] to ArrayList<Bond> bonds;
   !E. Make bonds array transient in Portfolio and implement readObject(ObjectOutputStream os) and
        writeObject(ObjectOutputStream os) methods to read and write the state of Bond objects explicitly.
*/
