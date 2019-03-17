package test3.q31;

/*
Given that java.lang.String has two overloaded toUpperCase methods - toUpperCase() and
        toUpperCase(Locale), consider the following code:
*/

import java.util.Locale;
import java.util.function.Function;
import java.util.function.Supplier;

public class q31 {
    public static void main(String[] args) {
        String name = "bob";
        String val = null;
/*
    Which of the following code fragments can be inserted in the code so that it will print BOB?
    Select 2 options: */
//   !A.
//    Supplier<String> s = name::toUpperCase;
//    val = s.get();

//    B.
//    Supplier<String> s = name::toUpperCase;
//    val = s.apply();

//    C.
//    Function<String> f = name::toUpperCase;
//    val = f.get();

//    D.
//    Function<String> f = name::toUpperCase;
//    val = f.apply();

//    E.
//    Function<String, Locale> f = name::toUpperCase;
//    val = f.apply();

//   !F. Only one of the above is correct.


        System.out.print(val);
    }
}

