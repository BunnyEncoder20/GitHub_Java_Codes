import java.util.*;
import java.util.LinkedList;

// CAT - 1 Portions for STS : 
// Stack , Queue (Arrray,LinkedList, Prefere -> Collections)
// Implementing Stack using Queue, Queue using Stack 
// Learn Collections all functions of Stack and Queue
// are un-built into that 
// MultiThreading 
// Exception handling Try-catch
// Postfix and prefix expressions 

// Exceptions and Custom Exceptions :

// class AgeException extends Exception{
//     AgeException(String message){
//         super(message);
//     }
// }

// class PasswordException extends Exception{
//     PasswordException(String msg){
//         super(msg);
//     }
// }

// class InvalidCreditException extends Exception{
//     InvalidCreditException(String msg){
//         super(msg);
//     }
// }

// public class cat1{
//     public static void main(String[] args){
//         Scanner op = new Scanner(System.in);

//         System.out.println("Enter your age : ");
//         int age = op.nextInt();

//         try{
//             checkage(age);
//         }
//         catch(Exception e){
//             System.out.println("Something went wrong - "+e);
//         }

//         System.out.println("Enter your password");
//         String pwd = op.nextline();
//         System.out.println("ReEnter your password");
//         String pwdrept = op.nextline();

//         try{
//             checkPassword(pwd,pwdrept);
//         }
//         catch(Exception e){
//             System.out.println("Something went wrong - "+e);
//         }
//         finally{
//             op.close();
//         }
//     }

//     static void checkage(int age) throws AgeException{
//         if(age<18){
//             throw new AgeException("\nYou must be 18+");
//         }
//         else{
//             System.out.println("You are now signed up");
//         }
//     }

//     static void checkPassword(String p1, String p2){
//         if(p1!=p2){
//             throw new PasswordException("\nThe reTyped password does match the orignal password");
//         }
//         else{
//             System.out.println("Password ok");
//         }
//     }

// }




// Stack & Queue Collections 
public class cat1{
    public static void main(String[] args){
        Queue<String> q1 = new LinkedList<>();
        q1.offer("karen");
        q1.offer("chad");
        q1.offer("jake");
        q1.offer("harold");
        System.out.println("Contents of the queue : "+q1);
        System.out.println("What's the size of queue? "+q1.size());
        System.out.println("Is harold in the queue? "+q1.contains("harold"));
        System.out.println("Peeking : "+q1.peek());
        q1.poll();
        System.out.println("Contents of the queue : "+q1);
        q1.poll();
        System.out.println("Contents of the queue : "+q1);
        q1.poll();
        System.out.println("Contents of the queue : "+q1);
        q1.poll();
        System.out.println("Contents of the queue : "+q1);
        System.out.println("is the queue empty ? "+q1.isEmpty());
        
    }
}