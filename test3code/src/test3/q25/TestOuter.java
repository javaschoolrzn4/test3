package test3.q25;

public class TestOuter {
    public void myOuterMethod() {
        // 1
          new TestOuter().new TestInner(); // E
          this.new TestInner(); // +
          new TestInner(); // A
    }
    public class TestInner { }
    public static void main(String[] args) {
        TestOuter to = new TestOuter();
        // 2
           to.new TestInner(); // +
    }
}

/*
    Which of the following options correctly instantiates a TestInner object?
        Select 2 options:
       !A. new TestInner(); at //1
        B. new TestInner(); at //2
        C. new to.TestInner(); at //2
        D. new TestOuter.TestInner(); at //2
       !E. new TestOuter().new TestInner(); at //1
*/
