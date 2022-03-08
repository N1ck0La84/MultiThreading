package ru.multiThreading;

public class MultiThreadingApp {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){
            new Example("Поток с номером: " + i).start();
        }
    }
}
