
class runnable_thread extends Thread{
    counter c = new counter();

    public runnable_thread(counter c){
        this.c = c;
    }

    public void run() 
    {
            c.counter0(20);
            System.out.print("\nThread 2 processing finished.");
    }
}

class runnable_thread2 extends Thread{
    counter c = new counter();

    public runnable_thread2(counter c){
        this.c = c;
    }
    public void run(){
        c.counter0(5);
        System.out.print("\nThread 2 processing finished.");
    }
}

class counter{
     synchronized public void counter0(int n){
        for (int i = 1; i <= 10; i++) {
            System.out.print("\n" + i*n);
        }

        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}   

public class temp00 {
    public static void main(String[] args) {
        counter c0 = new counter();

        runnable_thread t1 = new runnable_thread(c0);
        runnable_thread2 t2 = new runnable_thread2(c0);

        System.out.print("\nThread 1 status : " + t1.getState());
        System.out.print("\nThread 2 status : " + t2.getState());

        t1.start();
        t2.start();

        System.out.print("\nThread 1 status : " + t1.getState());
        System.out.print("\nThread 2 status : " + t2.getState());

        

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.print("\nThread 1 status : " + t1.getState());
        System.out.print("\nThread 2 status : " + t2.getState());
    }
} 