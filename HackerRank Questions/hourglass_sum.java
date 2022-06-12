import java.util.*;

public class hourglass_sum {
    public static void main(String[] args) {
        
        Integer[][] matrix = new Integer[6][6];
        Scanner op = new Scanner(System.in);
        
        for (int i = 0; i < matrix.length; i++) {
            String strMatrix[] = op.nextLine().split(" ");
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = Integer.parseInt(strMatrix[j]);
            }     
        }

        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix.length; j++) {
        //         System.out.print(matrix[i][j]+" ");
        //     }
        //     System.out.println("");
        // }

        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length-2; i++) {
            for (int j = 0; j < matrix.length-2; j++) {
                int temp_sum = matrix[i][j] + matrix[i][j+1] + matrix[i][j+2] + matrix[i+1][j+1] + matrix[i+2][j] + matrix[i+2][j+1] + matrix[i+2][j+2] ;
                max_sum = (temp_sum > max_sum) ? temp_sum : max_sum ;

                //for tenary operator it is important to assign a value while using it
                //otherwise throws a syntax error
            }
        }
        
        System.out.println(max_sum);
        op.close();
    }
}
