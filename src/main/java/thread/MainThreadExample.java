package thread;

public class MainThreadExample {
    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().getThreadGroup().getParent().list();

        Thread thread2 = new Thread(() -> {

            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.printf("%s is working, %c", Thread.currentThread().getName(), '\n');
            }

        });

        thread2.start();

        for (int i = 0; i < 10; i++) {
            Thread.sleep(500);
            System.out.printf("%s is now working, %c", Thread.currentThread().getName(), '\n');
        }

    }
}
