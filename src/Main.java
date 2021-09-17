public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread th = new Thread( new RunnableThread());
        th.start();
    }
}
