package test3.q32;

interface House{
    public default String getAddress(){
        return "101 Main Str";
    }
}
interface Office {
    public default String getAddress(){
        return "101 Smart Str";
    }
}
class HomeOffice implements House, Office{
    public String getAddress(){
        return "R No 1, Home";
    }
}
public class TestClass {
    public static void main(String[] args) {
        House h = new HomeOffice(); //1
        System.out.println(h.getAddress()); //2
    }
}

/*
Which statements about the code are correct?
Select 1 option:
        A. Code for class HomeOffice will cause compilation to fail.
        B. Line at //1 will cause compilation to fail.
        C. Line at //2 will cause compilation to fail.
        D. The code will compile successfully if the getAddress method is removed from class HomeOffice.
       !E. It will compile fine and print R No 1, Home when run.
*/
