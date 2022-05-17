import java.util.*;
public class sunsign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter your Date of birth : ");
        int date = sc.nextInt();
        System.out.print("\nEnter your Month of birth : ");
        String month = sc.next();

        chk_sunsign(date, month);
        sc.close();
    }

    static void chk_sunsign(int date,String month){
        switch (month) {
            case "January":
                    if (date<=19) {
                        System.out.print("\nYou are a Capricorn\n");
                    } else {
                        System.out.print("\nYou are a Aquarius\n");
                    }
                break;
                    
            case "February":
                    if (date<=18) {
                        System.out.print("\nYou are a Aquarius\n");
                    } else {
                        System.out.print("\nYou are a Pisces\n");
                    }
                    break;

            case "March":
                    if (date<=20) {
                        System.out.print("\nYou are a Pisces\n");
                    } else {
                        System.out.print("\nYou are a Aries\n");
                    }
                    break;    
            
            case "April":
                    if (date<=19) {
                        System.out.print("\nYou are a Aries\n");
                    } else {
                        System.out.print("\nYou are a Taurus\n");
                    }
                    break;    
            
            case "May":
                    if (date<=20) {
                        System.out.print("\nYou are a Taurus\n");
                    } else {
                        System.out.print("\nYou are a Gemini\n");
                    }
                    break;   

            case "June":
                    if (date<=20) {
                        System.out.print("\nYou are a Gemini\n");
                    } else {
                        System.out.print("\nYou are a Cancer\n");
                    }
                    break;

            case "July":
                    if (date<=22) {
                        System.out.print("\nYou are a Cancer\n");
                    } else {
                        System.out.print("\nYou are a Leo\n");
                    }
                    break;

            case "August":
                    if (date<=22) {
                        System.out.print("\nYou are a Leo\n");
                    } else {
                        System.out.print("\nYou are a Virgo\n");
                    }
                    break;      

            case "September":
                    if (date<=22) {
                        System.out.print("\nYou are a Virgo\n");
                    } else {
                        System.out.print("\nYou are a Libra\n");
                    }
                    break;  
                    
            case "October":
                    if (date<=22) {
                        System.out.print("\nYou are a Libra\n");
                    } else {
                        System.out.print("\nYou are a Scorpio\n");
                    }
                    break;  
                
            case "November":
                    if (date<=21) {
                        System.out.print("\nYou are a Scorpio\n");
                    } else {
                        System.out.print("\nYou are a Sagittarius\n");
                    }
                    break;

            case "December":
                    if (date<=21) {
                        System.out.print("\nYou are a Sagittarius\n");
                    } else {
                        System.out.print("\nYou are a Capricorn\n");
                    }
                    break;
            default:
                    System.out.print("\nWrong details entered try again\n");
                break;
        }
    }
}
