import java.io.*;

public class random_dice {
    public static void main(String args[]) throws IOException{
        temp obj = new temp();
        BufferedReader op = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(op.readLine());
        System.out.println(num);
        for (int i = 0; i < num; i++) {
            int dice1 = (int)(Math.random()*6)+1;
            int dice2 = (int)(Math.random()*6)+1;
            if (dice1==1 && dice2==1) {
                System.out.println("You be rolling Snake Eyes !");
                System.out.println("Dice1 = "+dice1+"\nDice2 = "+dice2);
            }
            else{
                System.out.println("nah...");
                System.out.println("Dice1 = "+dice1+"\nDice2 = "+dice2);
            }
        }
        op.close();
    }
}
