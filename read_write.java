class book{

    int semaphores;     //basically the number of readers at a given time 
    //took inspiration from OS 

    public book()
    {
        this.semaphores = 0;
    }

    public void read (int id) throws InterruptedException
    {
        //operations for the semaphores should always be inside a 
        //sychronized block.
        synchronized(this)
        {
            this.semaphores++;
            System.out.print("\nReader " + id + " starts reading");
        }

        Thread.sleep(300);       //acting as if system is reading something using sleep

        synchronized(this)
        {
            this.semaphores--;
            System.out.print("\nReader " + id + " stops reading");

            if (this.semaphores == 0)
                this.notifyAll();       //awakens all the threads in the waiting state
        }
    }

    public synchronized void write(int id) throws InterruptedException
    {
        //this method needs to be synchronized so that it can stop the exe
        //of the other threads when this one runs 
        while (this.semaphores!=0) {
            this.wait();
        }

        System.out.print("\nWriter " + id + " starts writing");

        Thread.sleep(300);

        System.out.print("\nWriter " + id + " stops writing");
        this.notifyAll();   //to wake up all the readers in waiting state 
    } 
}

class reader extends Thread{
    int readers;        //number of readers 
    int number;        
    book records ;  //will make reader for this book

    public reader (book records)    //constructor to initilize 
    {
        this.records = records;
        this.number = readers++;
    }

    public void run() 
    {
        while (this.number!=3) {

            try{ this.records.read(this.number); }
            catch(InterruptedException e){ System.out.print(e);}
            this.number++;
        }
    }
}
class writer extends Thread{
    int writers;
    int number;
    book records;
    
    public writer(book records)
    {
        this.records = records;
        this.number = writers++;
    }

    public void run()
    {
        while (number!=3) {

            try{ this.records.write(this.number); }
            catch(InterruptedException e){ System.out.print(e);}
            this.number++;
        }
    }
}

public class read_write {
    public static void main(String[] args) {
        // int readers = 3;
        // int writers = 3;
        book records =  new book();

        //for (int i = 0; i < readers; i++)
            new reader(records).start();

        //for (int i = 0; i < writers; i++)
            new writer(records).start();
      
    }
}
