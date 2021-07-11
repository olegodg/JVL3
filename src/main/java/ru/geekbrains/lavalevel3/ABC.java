package ru.geekbrains.lavalevel3;

public class ABC implements Runnable{
    static volatile char letter = 'A';
    static Object string = new Object();
    private char nowLetter;
    private char nextLetter;

    public ABC(char nowLetter, char nextLetter) {
        this.nowLetter = nowLetter;
        this.nextLetter = nextLetter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
        synchronized (string) {
            try {
                while (letter != nowLetter)
                    string.wait();
                System.out.print(nowLetter);
                letter = nextLetter;
                string.notifyAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    }
}
