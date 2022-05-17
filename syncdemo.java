class counter{
    int count;

    public synchronized void increment ()
    {
        count++;
        //by adding synchronized, me make this a synchronized function.
        //Means only one thread will work with function at a given time
        //
    }
}

public class syncdemo {
    public static void main(String[] args) {
        counter c = new counter();
        
        Thread t1 = new Thread(                     //use this cool way to make threads. Also less confusing
                                    new Runnable()  
                                    {
                                        public void run()
                                        {
                                            for (int i = 0; i < 10000; i++) {
                                                    c.increment();
                                            }
                                        }
                                    }
                                    );
        

        Thread t2 = new Thread(                     //use this cool way to make threads. Also less confusing
                                    new Runnable()  
                                    {
                                        public void run()
                                        {
                                            for (int i = 0; i < 10000; i++) {
                                                    c.increment();
                                            }
                                        }
                                    }
                                    );
        t1.start();
        t2.start();

        try {
            t1.join();
        } 
        catch (InterruptedException e) {
            System.out.print(t1.getStackTrace());
        }
        
        try {
            t2.join();
        } 
        catch (InterruptedException e) {
            System.out.print(t2.getStackTrace());
        }


        System.out.print("Count = " + c.count);
    }
}
