package test3.q01;

import java.util.function.Consumer;

public class Book {
    private int id;
    private String title;

    //constructors and accessors not shown
                                                                                                                                                                                                                                                                                                                                    public int getId(){return id;}public void setId(int i){id=i;}public String getTitle(){return title;}public void setTitle(String t){title=t;}
    public static void main(String[] args) {
                                                                                                                                                                                                                                                                                                                                    Book book=new Book(); book.setId(40);book.setTitle("Alibaba");
/*
Assuming that book is a reference to a valid Book object, which of the following code fragments correctly prints the
details of the Book?

Select 1 option: */

// A.
//Consumer<Book> c = b->b.getId()+":"+b.getTitle();
//c.accept(book);

//!B.
//Consumer<Book> c = b->System.out.println(b.getId()+":"+b.getTitle());
//c.accept(book);

//C.
//Consumer<Book> c = b->{ String details = b.getId()+":"+b.getTitle();};
//c.accept(book);
//System.out.println(c);

//D.
//Consumer<Book> c = System.out::println;
//c.accept(book);
    }
}



