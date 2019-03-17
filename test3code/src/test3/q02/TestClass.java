package test3.q02;

import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

public class TestClass{
    public static int operate(IntUnaryOperator iuo){
        return iuo.applyAsInt(5);
    }
    public static void main(String[] args) {
        IntFunction<IntUnaryOperator> fo = a-> b->a-b; //1
        int x = operate(fo.apply(20)); //2
        System.out.println(x);
    }
}

/*
What will the code print when compiled and run?
Select 1 option:
        A. Compilation error at //1
        B. Compilation error at //2
       !C. 15
        D. -15
        E. 20
        F. Exception at run time
*/