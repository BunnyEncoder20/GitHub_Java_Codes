// import java.lang.*;
// import java.util.*;

class card_number_exception extends Exception{
    card_number_exception(String message)   //constructor
    { 
        super(message);     //for super class Exception
    }   
} 

class name_case_exception extends Exception{
    name_case_exception(String message)
    {
        super(message);
    }
}

class invalid_cvv_exception extends Exception{
    invalid_cvv_exception(String message)
    {
        super(message);
    }
}

class invalid_date_exception extends Exception{
    invalid_date_exception(String message)
    {
        super(message);
    }
}

public class credit_card {
    String card_number;
    String name;
    String expiry_date;
    String CVV;
    String card_type;
    String bank_name;
    boolean valid = true;

    public credit_card(String card_number,String name,String CVV,String expiry_date,String card_type,String bank_name)
    {
        this.card_number = card_number;
        this.name = name;
        this.expiry_date = expiry_date;
        this.CVV = CVV;
        this.card_type = card_type;
        this.bank_name = bank_name;
    }

    public static void display(credit_card obj)
    {
        System.out.print("\nCard Number : "+obj.card_number);
        System.out.print("\nCard Number length : "+obj.card_number.length());
        System.out.print("\nName : "+obj.name+"\n");
        System.out.print("Expiry : "+obj.expiry_date+"\n");
        System.out.print("CVV : "+obj.CVV+"\n");
        System.out.print("Card Type : "+obj.card_type+"\n");
        System.out.print("Bank Name : "+obj.bank_name+"\n\n");
    }

    static void check_card_number(credit_card mycard) 
    {   
        try{
            if (mycard.card_number.length()!=16) {
                mycard.valid = false;
                throw new card_number_exception("\nInvalid Card Number\n");
            }
        }
        catch (card_number_exception e){
            System.out.print(e);
        }
        finally{
                System.out.println("test 1 : OK");
        }
    }

    static void check_name_case(credit_card mycard) throws name_case_exception
    {   
        
        if (mycard.name.toUpperCase()!=mycard.name) {
            mycard.valid = false;
            throw new name_case_exception("\nInvalid Name Case\n");
        }
        else {
            System.out.println("test 2 : OK");
        }
    }

    static void check_cvv_length(credit_card mycard) throws invalid_cvv_exception
    {   
        
        if (mycard.CVV.length()!=3) {
            mycard.valid = false;
            throw new invalid_cvv_exception("\nInvalid CVV\n");
        }
        else {
            System.out.println("test 3 : OK");
        }
    }

    static void check_cvv_zero(credit_card mycard) throws invalid_cvv_exception
    {   
        if (mycard.CVV.substring(0, 1)=="0") {
            mycard.valid = false;
            throw new invalid_cvv_exception("\nInvalid CVV\n");
        }
        else {
            System.out.println("test 4 : OK");
        }
    }

    static void check_date(credit_card mycard) throws invalid_date_exception
    {   
        if (Integer.parseInt(mycard.expiry_date.substring(3)) >2025) {
            mycard.valid = false;
            throw new invalid_date_exception("\nInvalid Date\n");
        }
        else {
            System.out.println("test 5 : OK");
        }
    }
    
    static void activation_code(credit_card mycard)
    {
        if (mycard.valid) {
            int type_num=0;       
            switch (mycard.card_type) {
                case "VISA":  type_num = 111;
                    break;

                case "Maestro":  type_num = 222;
                break;
                
                case "RuPay":  type_num = 333;
                break;
            }

            System.out.print("\nActivation Code for " +mycard.card_number+" :\n" +
            mycard.name.substring(mycard.name.length()-4).toUpperCase()+
            type_num+mycard.bank_name.substring(0,3)+"\n\n");
        }
        else
        {
            System.out.println("Invalid Card\n");
        }
    }

    public static void main(String[] args) {
     
        String card_number1="12345677890";      //10
        String card_number2="123456778908976521335";    //20
        String card_number3="1234567789089752";     //16
        
        credit_card mycard1 = new credit_card(card_number1,"Varun Verma","9876","06/2029","VISA","ICICI Bank"); 
        credit_card mycard2 = new credit_card(card_number2,"Tarun Verma","022","10/2024","Maestro","HDFC Bank"); 
        credit_card mycard3 = new credit_card(card_number3,"SENPAI SOMA","126","01/2023","RuPay","PunJab Bank"); 

        display(mycard1);
        display(mycard2);
        display(mycard3);

        //Validate Card 1 
        System.out.print("\n\nTesting Card 1\n");
        try{
            check_card_number(mycard1);
        }
        catch (Exception e){
            System.out.print("Error 101: "+e);
        }

        try{
            check_name_case(mycard1);
        }
        catch (Exception e){
            System.out.print("Error 102: "+e);
        }

        try{
            check_cvv_length(mycard1);
            check_cvv_zero(mycard1);
        }
        catch (Exception e){
            System.out.print("Error 103: "+e);
        }

        try{
            check_date(mycard1);
        }
        catch (Exception e){
            System.out.print("Error 104: "+e);
        }
        
        
        //Validate Card 2
        System.out.print("\n\nTesting Card 2\n");
        try{
            check_card_number(mycard2);
        }
        catch (Exception e){
            System.out.print("Error 101: "+e);
        }

        try{
            check_name_case(mycard2);
        }
        catch (Exception e){
            System.out.print("Error 102: "+e);
        }

        try{
            check_cvv_length(mycard2);
            check_cvv_zero(mycard2);
        }
        catch (Exception e){
            System.out.print("Error 103: "+e);
        }

        try{
            check_date(mycard2);
        }
        catch (Exception e){
            System.out.print("Error 104: "+e);
        }


        //Validate Card 3
        System.out.print("\n\nTesting Card 3\n");
        try{
            check_card_number(mycard3);
        }
        catch (Exception e){
            System.out.print("Error 101: "+e);
        }

        try{
            check_name_case(mycard3);
        }
        catch (Exception e){
            System.out.print("Error 102: "+e);
        }

        try{
            check_cvv_length(mycard3);
            check_cvv_zero(mycard3);
        }
        catch (Exception e){
            System.out.print("Error 103: "+e);
        }

        try{
            check_date(mycard3);
        }
        catch (Exception e){
            System.out.print("Error 104: "+e);
        }


        //if card valid, print activation code
        System.out.print("\n\nCard 1 :");
        activation_code(mycard1);
        
        System.out.print("\nCard 2 :");
        activation_code(mycard2);

        System.out.print("\nCard 3 :");
        activation_code(mycard3);
    }
}