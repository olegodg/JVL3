package ru.geekbrains.lavalevel3;

public class HomeWork4 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ABC('A','B'));
        Thread t2 = new Thread(new ABC('B','C'));
        Thread t3 = new Thread(new ABC('C','A'));
        t1.start();
        t2.start();
        t3.start();
    }
}
