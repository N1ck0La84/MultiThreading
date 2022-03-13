package ru.multuThreadingStoreKA;

public class Client extends Thread {

    public String name;
    public String id;

    public Client(String name, String id) {
        super(name);
        this.name = name;
        this.id = id;
    }

    public void run(){
        System.out.println(Thread.currentThread().getName() + " " + id + " выбрал товар");
        try {
            Thread.sleep(100);
        }catch (InterruptedException ex){
            System.out.println("Thread has been interrupted");
        }
        System.out.println(Thread.currentThread().getName() + " " + id + " положил товар в корзину");
        }

}
