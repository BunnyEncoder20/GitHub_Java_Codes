class counter{
    int count;

    public void increment()     //synchronization problem occuring here
    {
        count++;            //cause both the threadds are trying to access the 
        //same variable at the same time, we're not getting expected output 
    }
}

public class thread2 {
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
