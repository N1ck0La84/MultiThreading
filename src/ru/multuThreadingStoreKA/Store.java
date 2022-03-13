package ru.multuThreadingStoreKA;

public class Store {
    public static void main(String[] args) {

        System.out.println("Товар поступил в магазин");

        Client c1 = new Client("Вася", "666");
        Client c2 = new Client("Алёша", "667");
        Client c3 = new Client("Коля", "777");
        Client c4 = new Client("Петя", "555");
        c1.start();
        c2.start();
        c3.start();
        c4.start();

        if (!Thread.currentThread().isAlive())
        {
            System.out.println("Товар закончился");
        }


    }
}
