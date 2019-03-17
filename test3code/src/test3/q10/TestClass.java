package test3.q10;

interface House{
    public default String getAddress(){
        return "101 Main Str";
    }
}
interface Office {
    public static String getAddress(){
        return "101 Smart Str";
    }
}
interface WFH extends House, Office{
}

class HomeOffice implements House, Office{
    public String getAddress(){
        return "R No 1, Home";
    }
}
public class TestClass {
    public static void main(String[] args) throws InterruptedException {
        Office off = new HomeOffice(); //1
     //   System.out.println(off.getAddress()); //2
    }
}

/*
Which statements about the code are correct?
Select 1 option:
        A. Code for class HomeOffice will cause compilation to fail.
        B. Code for interface WFH will cause compilation to fail.
        C. It will compile fine and print R No 1, Home when run.
        D. Line at //1 will cause compilation to fail.
       !E. Line at //2 will cause compilation to fail.

*/