import java.util.*;
public class isLowerTriangularMat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mat[][]=new int[4][4];
        System.out.print("\nEnter the elements of the matrix(4x4) :\n");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        
        display_mat(mat);

        if (is_LowerTriangular(mat)) {
            System.out.println("\nThe entered Matrix is a Lower Triangular Matrix!\n");
        } else {
            System.out.println("\nThe entered Matrix is NOT a Lower Triangular Matrix!\n");
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

    static boolean is_LowerTriangular(int mat[][]){
        for (int i = 0; i < 4; i++) {
            for (int j = i+1; j < 4; j++) {
                if (mat[i][j]!=0) {
                    return false;
                }
            }
        }

        return true;
    }

}
