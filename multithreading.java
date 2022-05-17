class myThread extends Thread {
    @Override
    public void run(){
            System.out.println(Thread.currentThread().getName()+" has started");
            for (int i = 100; i > 0; i--) {
                System.out.println(i);
                try {
                    Thread.sleep(60);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
    }
}

class myRunnable implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName()+" has started");
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(60);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // int x=1,y=0;
                // System.out.println(x/y);
            }
    }
}

public class multithreading {
    public static void main(String[] args) throws InterruptedException {
        // System.out.println("Number of threads : "+Thread.activeCount());
        // System.out.println("Current Thread name : "+Thread.currentThread().getName());
        // Thread.currentThread().setName("Varun's Main Thread");
        // System.out.println("Changed Current Thread name : "+Thread.currentThread().getName());

        // for (int i = 5; i > 0; i--) {
        //     System.out.println(i);
        //     Thread.sleep(1000);     //nice way to add some delay
        // }
        System.out.println("Completed!");

        myThread t1 = new myThread();
        Thread t2 = new Thread(new myRunnable());

        t1.setName("Baby Thread 1");
        t2.setName("Baby Thread 2");
        System.out.println("Name of other Threads : "+"\n"+t1.getName()+"\n"+t2.getName());
        t1.start();  t2.start();
        t1.join(); //main thread will pause here and wait for thread1 to complete and then only resume with the rest of the code
        //if time is mentioned then the the main thread will resume after the specified amount of time
    }
}
