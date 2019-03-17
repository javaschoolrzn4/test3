package test3.q37;

public class TestClass extends Thread {
    String name = "";
    public TestClass(String str) {
        name = str;
    }
    public void run() {
        try {
            Thread.sleep( (int) (Math.random()*1000) );
            System.out.println(name);
        } catch(Exception e) { }
    }
    public static void main(String[] str) throws Exception {
        Thread t1 = new TestClass("tom");
        Thread t2 = new TestClass("dick");
        t1.start();t2.start();
        t1.join(); t2.join();
        System.out.println("harry");
    }
}

/*
    Select 1 option:
        A. It will always print tom, dick, and harry, in that order.
       !B. It will always print harry in the end.
        C. It may print tom, dick, and harry, in any order.
        D. tom will always be printed before dick.
        E. tom will always be printed first.
*/
