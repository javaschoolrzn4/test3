package ru.school.java;

public class Start {
    public static void main(String[] args) {
        Data data = new Data();
        Main main1 = new Main(data);
        Main main2 = new Main(data);
        main1.start();
        main2.start();

    }
}
