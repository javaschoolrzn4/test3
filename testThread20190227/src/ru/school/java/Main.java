package ru.school.java;

class Data {
    public volatile int test;
}

public class Main extends Thread {
    private Data data;

    Main(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        super.run();
        System.out.println(data.test);
        data.test = 3;
        System.out.println(data.test);
    }

}
