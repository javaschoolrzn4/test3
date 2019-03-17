package test3.q36;

class Hello implements Runnable{
    int i;
    public void run(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){}
        i = 20;
    }
}
public class Test {
    static public void main(String[] args) throws Exception{
        Hello h = new Hello();
        Thread t = new Thread(h);
        t.start();

        //line 1
//        h.wait();            //a
//        t.wait();            //b
//        t.yield();           //c
//        t.join();            //d
//        h.notify();          //e
//        t.notify();          //f
//        t.interrupt();       //g

        System.out.println("h.i = " + h.i);
    }
}

/*
Given the class, what should be inserted at //line 1 to make sure that it prints h.i = 20?

        Select 1 option:
        A. any one of a, b, g
        B. any one of c, e, f
        C. any one of c, d, f
       !D. Only d
        E. Only b
*/
