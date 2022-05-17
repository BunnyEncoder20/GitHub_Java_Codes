//program to give minimum cost assembly line 
public class assembly_line {
    static int n = 5;
    public static void main(String[] args) {
        int st_cost[][] = { {8,10,4,5,9} , {9,6,7,5,6} } ;
        int transfer_cost[][] = { {0,2,3,1,3} , {0,2,1,2,2} } ;
        int entry[] = {3,5} ; 
        int exit_[] = {2,1} ;

        System.out.print("\n\nThe minimum cost to assemble is = " +  assembly(st_cost,transfer_cost,entry,exit_));
    }

    static int minimum(int x, int y)
    { return x < y? x : y;}


    static int assembly(int st_cost[][], int transfer_cost[][], int entry[], int exit_[])
    {
        int cost_line1[] = new int[n] ;
        int cost_line2[] = new int[n] ;
        int i;

        cost_line1[0] = entry[0] + st_cost[0][0]; 
        cost_line2[0] = entry[1] + st_cost[1][0]; 

        for(i=1;i<n;i++){
            cost_line1 [i] = minimum(cost_line1 [i-1] + st_cost[0][i] , cost_line2[i-1] + transfer_cost[1][i] + st_cost[0][i] ) ;
            cost_line2 [i] = minimum(cost_line2[i-1] + st_cost[1][i], cost_line1[i-1] + transfer_cost[0][i] + st_cost[1][i] ) ;
        }

        // System.out.print("\nCost_line1[n-1] = " + cost_line1[n-1]);
        // System.out.print("\nCost_line2[n-1] = " + cost_line2[n-1]);
        return minimum(cost_line1[n-1] + exit_[0] , cost_line2 [n-1]+ exit_[1]);
    }
}
