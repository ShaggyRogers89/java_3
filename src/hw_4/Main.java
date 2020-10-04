package hw_4;

public class Main {
    private static volatile char c = 'C';
    private static final int COUNT = 5;
    private static final Object lock = new Object();

    public static void main(String[] args) {
        thread('A', 'B').start();
        thread('B', 'C').start();
        thread('C', 'A').start();
    }

    static Thread thread(char firstChar, char nextChar) {
        return new Thread(() -> {
            try {
                for (int i = 0; i < COUNT; i++) {
                    synchronized (lock) {
                        while (c != firstChar) {
                            lock.wait();
                        }
                        System.out.print(nextChar);
                        c = nextChar;
                        lock.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}

