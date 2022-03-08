package ru.multiThreading;

public class Example extends Thread{

    public Example(String ThreadName) {
        super(ThreadName);
    }
    public void run(){
        System.out.println(Thread.currentThread().getName() + " - запущен.");
        try {
            Thread.sleep(100);
        }
        catch (InterruptedException ex) {
            System.out.println("Thread has been interrupted");
        }
        System.out.println(Thread.currentThread().getName() + " - завершен.");
    }

}
