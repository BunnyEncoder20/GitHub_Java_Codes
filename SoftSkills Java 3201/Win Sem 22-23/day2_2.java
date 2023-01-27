import java.util.*;

public class day2_2 {
    // check the ppt, Idk wha this program is doing 
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        Stack<Integer> stk = new Stack<>();
        String str = op.next();

        stk.push(str);
        int index;

        while(!stk.empty())
        {
            String current = stk.pop();
            if((index = current.indexof('?')) != -1)
            {
                for(char ch = '0'; ch <= '1'; ch++){
                    current = current.substring(0, index) + ch + current.substring(index+1);
                    stk.push(current);
                }
            }
        }

        op.close();
    }
}
