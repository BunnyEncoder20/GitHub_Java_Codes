import java.util.*;

public class day2_1 {
    // Using Stack calculate the PostFix expression 
    // Eg : 74-3*15+* >>> 54
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        Stack<Integer> stk = new Stack<>();

        String expstring = op.nextLine();

        for (int i = 0; i < expstring.length(); i++) {
            char ch = expstring.charAt(i);

            if(Character.isDigit(ch))
                stk.push(ch-'0');
            else{
                int value1 = stk.pop();
                int value2 = stk.pop();

                switch(ch){
                    case '+' : stk.push(value2+value1);
                    break;

                    case '-' : stk.push(value2-value1);
                    break;

                    case '*' : stk.push(value2*value1);
                    break;

                    case '/' : stk.push(value2/value1);
                }
            }
        }

        System.out.println("Answer : "+stk.pop());
        op.close();
    }
}
