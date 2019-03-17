package test3.q33;

import java.io.FileNotFoundException;
import java.io.IOException;

interface I1
{
    void m1() throws java.io.IOException;
}
interface I2
{
    void m1() throws java.io.FileNotFoundException;
}

public class q33 implements I1, I2 {

    @Override
    public void m1()
//            throws Exception
//            throws IOException
//            throws FileNotFoundException
    {

    }
}

/*
    Which of the following are valid method declarations for a class that says it implements I1 and I2 ?
        Select 1 option:
        A. Both, public void m1() throws FileNotFoundException; and public void m1() throws IOException;
       !B. public void m1() throws FileNotFoundException
        C. The class cannot implement both the interfaces as they have conflicting methods.
        D. public void m1() throws Exception;
        E. None of the above.
*/
