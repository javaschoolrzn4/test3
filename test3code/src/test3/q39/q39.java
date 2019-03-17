package test3.q39;

import java.util.ArrayList;

interface Process{
    public void process(int a, int b);
}

class Data{
    int value;
    Data(int value){
        this.value = value;
    }

}

public class q39 {

    public static void processList(ArrayList<Data> dataList, Process p) {
        for (Data d : dataList) {
            p.process(d.value, d.value);
        }
    }

    public static void main(String[] args) {
        ArrayList<Data> al = new ArrayList<Data>();
        al.add(new Data(1));
        al.add(new Data(2));
        al.add(new Data(3));
        //INSERT METHOD CALL HERE
/*    Which of the following options can be inserted above so that it will print 1 4 9?
        Select 3 options: */
//        A.
//            processList(al, a, b->System.out.println(a*b));
//       !B.
            processList(al, (int a, int b)->System.out.println(a*b) );
//        C.
//            processList(al, (int a, int b)->System.out.println(a*b); );
//       !D.
            processList(al, (a, b)->System.out.println(a*b));
//       !E.
            processList(al, (a, b) ->{ System.out.println(a*b); } );

    }


}
