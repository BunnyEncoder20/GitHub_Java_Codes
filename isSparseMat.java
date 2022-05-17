import java.util.*;
public class isSparseMat{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r;
        System.out.print("\nEnter the rows and colomns of Square Matrix : \n");
        r = sc.nextInt();

        int mat[][]=new int[r][r];
        System.out.print("\nEnter the elements of the matrix(4x4) :\n");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        
        display_mat(mat);

        if (is_sparse(mat)) {
            System.out.println("\nThe entered Matrix is a Sparse Matrix!\n");
        } else {
            System.out.println("\nThe entered Matrix is NOT a Sparse Matrix!\n");
        }

        sc.close();
    }

    static void display_mat(int mat[][]){
        System.out.print("\n\n");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.print("\n");
        }

        System.out.print("\n\n");
    }

    static boolean is_sparse(int mat[][]){
        int non_zero=0;int zero=0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j]==0) {
                    zero++;
                }
                else{
                    non_zero++;
                }
            }
        }

        boolean result = zero>non_zero?true:false;
        return result;
    }
}