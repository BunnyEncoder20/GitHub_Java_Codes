class username {
    String uname;
    boolean valid;

    public username(String uname){
        this.uname = uname;
        this.valid = true;
    }

    void validate_length(){
        
        if (this.valid) {
            if(this.uname.length()<8 || this.uname.length()>30)
                this.valid = false;
        }
        else{
            return;
        }
    }

    // public static boolean isAlphaNumeric(String s) {
	// 	return s.matches("^[a-zA-Z0-9_]*$");
	// }
    
    void validate_alphanum(){
        
        if (this.valid) {
            this.valid = this.uname.matches("^[a-zA-Z0-9_]*$");
        }
        else{
            return;
        }
    }

    void validate_first_character(){
        
        if (this.valid) {
            this.valid = this.uname.substring(0,1).matches("^[a-zA-Z]*$");
        }
        else{
            return;
        }
    }

    void display(){
        if (this.valid) {
            System.out.print("\nUsername : "+this.uname+"\t"+"Valid");
        }
        else{
            System.out.print("\nUsername : "+this.uname+"\t"+"Invalid");
        }
    }
}

public class username_update {
    public static void main(String[] args) {
        String str1 = "Samantha_21";
        String str2 = "1Samantha";
        String str3 = "Julia";

        username myuser1 = new username(str1);
        username myuser2 = new username(str2);
        username myuser3 = new username(str3);

        myuser1.validate_length();
        myuser1.validate_alphanum();
        myuser1.validate_first_character();

        myuser2.validate_length();
        myuser2.validate_alphanum();
        myuser2.validate_first_character();

        myuser3.validate_length();
        myuser3.validate_alphanum();
        myuser3.validate_first_character();

        myuser1.display();
        myuser2.display();
        myuser3.display();
    }
}
