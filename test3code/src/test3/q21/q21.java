package test3.q21;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class q21 {

    public static void createFile(String name) throws Exception {
        try (
                OutputStream os = new FileOutputStream(name);) {
/*
    Which of the following combinations of the lines of code and their outcome when inserted above, are correct?
    Select 2 options:  */
// A.
      PrintWriter pw = new PrintWriter(os);
      pw.write(1);
//    Size of the file depends on default character encoding.

// B.
//      os.write(99);
//    A file of size 1 byte will be created.

// C.
//      BufferedOutputStream bos = new BufferedOutputStream(os);
//      PrintWriter pw = new PrintWriter(bos);
//      pw.print(99);
//    A file of size 1 byte will be created.

// D.
//      os.writeInt(99);
//    A file of size 4 bytes will be created.

// E.
//      PrintWriter pw = new PrintWriter(os);
//      pw.writeInt(1);
//    A file of size 4 bytes will be created.

//flush and close the streams that are open
      pw.close();
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(Charset.defaultCharset());
        System.out.println(Charset.defaultCharset());
        String name = "testFile";
        createFile(name);
        File f = new File(name);
        System.out.println(f.length());
    }
}


// VM options:-Dfile.encoding=UTF-16
