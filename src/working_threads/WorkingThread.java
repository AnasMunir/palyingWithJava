package working_threads;

/**1
 * Created by anas on 10/23/15.
 */
public class WorkingThread {

    public static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("My first thread in Java");
            Thread thread = Thread.currentThread();
            System.out.print(thread.getName());
        }
    }

    public static void main(String[] args) {
        Thread myThread = new Thread(new MyRunnable(), "MyThread");
        //System.out.println(myThread.getName());
        myThread.start();

    }
}
