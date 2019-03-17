package test3.q20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class LineByLineProcessor {

    public void processLines(String fullFilePath) throws Exception {
// declare and initialize "handle" here
/*
    A programmer is writing a small component that processes a file line by line. The following is the code :

    Which of the given options will declare and initialize handle appropriately?
        Select 2 options:                                                        */
//        A.
//        Reader handle = new FileReader(fullFilePath);
//        B.
//        BufferedReader handle = new BufferedReader(fullFilePath);
//        C.
//        BufferedReader handle = new BufferedReader(new File(fullFilePath));
//       !D.
        BufferedReader handle = new BufferedReader(new FileReader(fullFilePath));
//       !E.
//        BufferedReader handle = new BufferedReader(new FileReader( new File(fullFilePath)));

        String str = null;
        while( (str = handle.readLine()) != null) {
            System.out.println("Processing line : "+str);
        }
        handle.close();
    }
}

