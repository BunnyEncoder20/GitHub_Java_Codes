//jumping statement
/*
 * break and continue } always use inside a loop, 
 * otherwise there will be errors
 * 
 * [00 01 02]
 * [10 11 12]
 * [20 21 22]
 */


/**
 * day11
 */
public class day11 {
    public static void main(String[] args) {
        String  s = "";
        for (int i = 2; i < 7; i++) {
            if(i==3)
                continue;
            if(i==5)
                break;
            s+=i;       //note here i is concatinated as a string , hence no type mismatch error
        }
        // System.out.println(s);

        //Pattern questions !IMPORTANT!

        System.out.println("\nSquare n=3");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        
        System.out.println("\nHollow Square n=3");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i==1 && j==1){
                    System.out.print("  "); 
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("\nUpper Triangle Matrix n=3");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i<=j)
                    System.out.print("* ");
                else
                    continue;
            }
            System.out.println("");
        }

        System.out.println("\nLower Triangle Matrix n=3");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i>=j)
                    System.out.print("* ");
                else
                    continue;
            }
            System.out.println("");
        }

        System.out.println("\nTriangle n=3");
        for (int i = 1; i <= 3; i++) {
            for (int k = 0; k <= 3-i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("\nInverted Triangle n=3");
        for (int i = 1; i <= 3; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 3-i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("\nDiamond n=3");
        for (int i = 1; i <= 3; i++) {
            for (int k = 0; k <= 3-i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = 2; i <= 3; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 3-i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("\nHollow Diamond n=3");
        for (int i = 1; i <= 3; i++) {
            for (int k = 0; k <= 3-i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if(i==3&&j==2){System.out.print("  "); continue;}
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = 2; i <= 3; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 3-i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        

    }
}