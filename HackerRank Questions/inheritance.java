import java.util.Scanner;

class person{
    
}

class student extends person{
    String firstname;
    String lastname;
    int idnumber;
    int[] scores;
    char Grade;

    public student(String firstname, String lastname, int idnumber, int[] scores){
        this.firstname = firstname;
        this.lastname = lastname;
        this.idnumber = idnumber;
        this.scores = scores;

    }

    public char calculate(){
        int total = 0; 
        for (int i : this.scores) {
            total += i;
        }
        double avg = total/this.scores.length ;
        
        if (90<=avg && avg<=100) {
            this.Grade = 'O';
        } else {
            if (80<=avg && avg<90) {
                this.Grade = 'E';
            } else {
                if (70<=avg && avg<80) {
                    this.Grade = 'A';
                } else {
                    if (55<=avg && avg<70) {
                        this.Grade = 'P';
                    } else {
                        if (40<=avg && avg<55) {
                            this.Grade = 'D';
                        } else {
                            this.Grade = 'T';
                        }
                    }
                }
            }
        }

        return this.Grade;
    }

    public void get_student(){
        System.out.println("Name: "+this.firstname+", "+this.lastname);
        System.out.println("ID: "+idnumber);
        // System.out.println("Scores: ");
        // for (int i : scores) {
        //     System.out.print(i+" ");
        // }
    }
}

public class inheritance {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        String fname,lname; int idnum;
        // System.out.println("Fname, lname and idnum :"); 
        String[] temp = op.nextLine().split(" ");
        fname = temp[0];
        lname = temp[1];
        idnum = Integer.parseInt(temp[2]);
        
        

        // System.out.println("Number of tests : ");
        int no_of_tests = op.nextInt();
        int[] scores = new int[no_of_tests];

        String temp2 = op.nextLine();

        // System.out.println("enter the scores : ");
        String[] temp3 = op.nextLine().split(" ");

        for (int i = 0; i < no_of_tests; i++) {
            scores[i] = Integer.parseInt(temp3[i]);
        }

        student stud1 = new student(fname, lname, idnum, scores);
        stud1.get_student();
        System.out.println("Grade: "+stud1.calculate());

        op.close();
    }
}
