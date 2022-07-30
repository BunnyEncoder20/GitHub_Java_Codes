/*
primitive 
byte [-128 to 127]
int [4 bytes]
short [2]
long [8]
char [2]
boolean [1]
flaot[4] - 6/7 decimal (precision) points
double[8] - 15 decimal points
//non primitive 

variable names are given to retrive values from memory location in ram
eg:
    byte myNum = 100 ;
        myNum       - Memory ref name
          [100]           - Memory block
          1200           - Memory location

Long values need to be  needed with L at the end
eg : long myNum = 15000000000L ;

Float need to be ended with small f
float myNum = 5.782f ; 

double : 
double myNum = 19.9998d ;

Char : 
**Java follows Unicode standard which requires 2 byte 
Most of the other languages use the ASCII standard and hence require only 1 byte char
char mychar = '<anything>' ; 
char mychar = 'A' ; 
char mychar = '2' ; 
char mychar = '#' ; 
*Size of char in java is 2 bytes 

*variable names can start with _ or $ but not with digits(1,2,3,4,etc)

*/
public class day3 {
    int globalNum = 10; 
    static int globalvar = 100;
    public static void main(String[] args) {
        long $myNum = 150000000000L;
        float $myNumf = 13.56f;
        System.out.println($myNum);
        System.out.println($myNumf);
        System.out.println(globalvar);
        day3 obj = new day3();
        System.out.println(obj.globalNum);

        char wide = 'a' ;
        int i = wide;
        System.out.println(i); //this is widening
        /*occurs when you convert lower data type (lower byte  size) to higher data type ( higher byte size) */

        System.out.println("Y"+"O");    //prints the strings hence alphabets
        System.out.println('L'+'O');    //prints the characters hence the number
    }
}
