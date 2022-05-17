class thread1 implements Runnable{
    public void run()
    {
        for (int i = 2; i <=50; i++) {
            if(i%2==0)
                System.out.print(i + "\n");
                try{
                    Thread.sleep(125);
                }catch(Exception e){e.printStackTrace();}
        }
        // System.out.print("\n\n");
    }
} 

class thread2 implements Runnable{
    public void run()
    {
        for (int i = 1; i <50; i++) {
            if(i%2==1)
                System.out.print(i + "\n");
                try{
                    Thread.sleep(125);
                }catch(Exception e){e.printStackTrace();}
        }
        // System.out.print("\n\n");
    }
} 

class thread3 implements Runnable{
    public void run()
    {
        for (int i = 2; i <= 47; i++) {
            if (is_prime(i))
                System.out.print(i + "\n");
                try{
                    Thread.sleep(125);
                }catch(Exception e){e.printStackTrace();}
        }
    }

    public boolean is_prime(int num)
    {
        int half = num/2;
        boolean flag = true;
        for (int i = 2; i <= half; i++) 
        {
            if (num%i==0)
            {
                flag = false;
                return flag;
            }
        }

        return flag;
    }
} 
public class threads {
    public static void main(String[] args) {

        Runnable r1 = new thread1();    //make runnable object of class thread1
        Thread th1 = new Thread(r1,"thread #1");   //make thread class object
        System.out.print(th1.getName()+"\n");        //gets the name of the thread
        th1.start();            //puts the thread in active state   
        try {
            th1.join();         //waits for thread1 to finish execution 
        } catch (Exception e) {
            System.out.print("Error : " + e);
        }
        System.out.print(th1.getName()+" completed execution.\n\n"); 

        Runnable r2 = new thread2();
        Thread th2 = new Thread(r2,"thread #2");
        System.out.print(th2.getName()+"\n");
        th2.start();
        try {
            th2.join();
        } catch (Exception e) {
            System.out.print("Error : " + e);
        }
        System.out.print(th2.getName()+" completed execution.\n\n");

        Runnable r3 = new thread3();
        Thread th3 = new Thread(r3,"thread #3");
        System.out.print(th3.getName()+"\n");
        th3.start();
        try {
            th3.join();
        } catch (Exception e) {
            System.out.print("Error : " + e);
        }
        System.out.print(th3.getName()+" completed execution.\n\n");
    }
}