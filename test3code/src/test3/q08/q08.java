package test3.q08;

class TaskBase {
    int getStatusCode(Object obj) throws NullPointerException {
        if(obj != null ) return 1;
        else return 0;
    }
}
class ParallelTask extends TaskBase {
//override getStatusCode method.
}

/*
    Which of the following statements are valid?
        Select 2 options:
        A. Overriding method can take String as a parameter.
        B. Overriding method can return a long instead of int.
       !C. Overriding method can throw any RuntimeException.
       !D. Overriding method cannot throw any checked exception.
        E. Overriding method may declare the return type as byte.

*/
