import java.util.Scanner;

class Difference{
    private int _elements[];
    public int maximumDifference=0;

    public Difference(int array[]){
        this._elements=array;
    }

    public void computeDifference(){
        for (int i = 0; i < _elements.length; i++) {
            for (int j = 0; j < _elements.length; j++) {
                if (_elements[i]>=_elements[j]) {
                    maximumDifference=maximumDifference<_elements[i]-_elements[j]?_elements[i]-_elements[j]:maximumDifference;
                }
            }
        }
        System.out.println(maximumDifference);
    }
}

public class day14 {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        int size = op.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i]=op.nextInt();
        }
        Difference obj = new Difference(array);
        obj.computeDifference();
        op.close();
    }
}
