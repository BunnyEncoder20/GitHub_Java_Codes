import java.util.Scanner;

class log{
    public int sum(int[] array){
        int total =0 ;
        for (int i : array) {
            total += i;
        }
        return total;
    }

    public void search(int[] array,int num){
        for(int i : array){
            if (i==num) {
                System.out.println("Element found : " + i);
                break;
            }
        }
    }

    public void count(int[] array, int num){
        int times=0;
        for(int i:array){
            if (i==num) {
                times++;
            }
        }
        System.out.println("The number of times = "+times);
    } 

    public int maxi(int[] array){
        int max=-1;
        for (int i : array){
            if(max<i) max=i;
        }
        return max;
    }

    public void sumthis(int[] array, int sum){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i]+array[j]==sum)
                    System.out.println(array[i] + " + " + array[j]+" = "+sum);
            }
        }
    }

    public void rotatearray(int[] array, int rot){
        for (int i = 0; i < rot; i++) {
            int temp = array[0];
            for(int j=1;j<array.length;j++){
                array[j-1] = array[j];
            }
            array[array.length-1] = temp;
        }

        System.out.print("[ ");
        for(int i : array){
            System.out.print(" "+i+" ");
        }
        System.out.print(" ]");
    }
}
public class temp{
    public static void main (String[] args){
        Scanner op = new Scanner(System.in);
        int array[] = {1,2,3,4,5};
        log obj = new log();
        System.out.println("Sum : "+obj.sum(array));

        System.out.println("Enter the number to be searched : ");
        int num = op.nextInt();
        obj.search(array, num);
        obj.count(array, num);
        System.out.println("Maximum Number is : " + obj.maxi(array));
        System.out.println("Sum should be ? : ");
        int thissum = op.nextInt();
        obj.sumthis(array, thissum);
        System.out.println("Enter the number of rotations");
        int rotations = op.nextInt();
        obj.rotatearray(array, rotations);
        op.close();
    }
}