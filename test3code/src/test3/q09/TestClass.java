package test2.q09;

import java.io.*;

class Boo {
    int boo = 10;
    public Boo(int k){ System.out.println("In Boo k = "+k); boo = k;}
}
class BooBoo extends Boo {
    public BooBoo(int k ){ super(k); System.out.println("In BooBoo k = "+k); }
}
class Moo extends BooBoo implements Serializable {
    int moo = 10;
    public Moo(){ super(5); System.out.println("In Moo"); }
}
public class TestClass {
    public static void main(String[] args) throws Exception{
        Moo moo = new Moo();
        FileOutputStream fos = new FileOutputStream("c:\\temp\\moo1.ser");
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(moo);
        os.close();
        FileInputStream fis = new FileInputStream("c:\\temp\\moo1.ser");
        ObjectInputStream is = new ObjectInputStream(fis);
        moo = (Moo) is.readObject();
        is.close();
    }
}

// What will be a part of the output when the following code is compiled and run?
//    Choose all that apply:
//       !A. In Boo k = 5
//           In BooBoo k = 5
//        B. In Boo k = 0
//           In BooBoo k = 0
//       !C. In Moo
//       !D. It will throw an exception at runtime.
//        E. It will not compile.
