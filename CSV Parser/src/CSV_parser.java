import java.io.* ;
import java.util.* ;
import java.util.concurrent.TimeUnit;

public class CSV_parser {
    public static void main(String[] args) throws Exception{
        // csvReader();
        // csvReader_Buffered();
        // String[] temp = new String[3] ;
        // temp[0] = "120";
        // temp[1] = "322";
        // temp[2] = "890";
        // int[] tempint = new int[3];
        // for (int i = 0; i < tempint.length; i++) {
        //     tempint[i] = Integer.parseInt(temp[i]);
        // }
        // for (int i = 0; i < tempint.length; i++) {
        //     System.out.println(tempint[i]);
        // }

        csv_5_number_summary();
    }

    public static void csvReader(){
        try{
            Scanner file = new Scanner(new File("C:\\Users\\gener\\Coding\\Java\\CSV Parser\\src\\Main\\Resources\\Friends.csv")) ;
            file.useDelimiter(",");

            while(file.hasNext()){
                System.out.print(file.next()+"  "); 
            }
            file.close();
        }
        catch (FileNotFoundException fnf){
            System.out.println("File not found");
        }
    }

    public static void csvReader_Buffered() throws IOException{
        String path = "C:\\Users\\gener\\Coding\\Java\\CSV Parser\\src\\Main\\Resources\\sample1.csv" ;
        
        try{
            BufferedReader bin = new BufferedReader(new FileReader(path));
            String line = "" ;
            String[] values = new String[20];

            while ((line = bin.readLine()) != null){
                // System.out.print(line);

                values = line.split(","); //willl split the line into array elements 
                System.out.println(values[2]); //will display the element in the 0th index of thay array
                //this way the loop will only diaplay the elements in ith column of the csv file
            }
            bin.close();
        }
        catch(FileNotFoundException fnf){
            System.out.println("File not found");
        }
    }

    public static void  csv_5_number_summary() throws IOException, InterruptedException{
        try {
            BufferedReader bread1 = new BufferedReader(new FileReader("C:\\Users\\gener\\Coding\\Java\\CSV Parser\\src\\Main\\Resources\\sample1.csv" ));
            String[] values = new String[20];
            String row = "";

            int number_of_lines = 0 ;
            while ((row = bread1.readLine()) != null){
                number_of_lines++;  //counting the number of lines in file
            }
            bread1.close();




            BufferedReader bread2 = new BufferedReader(new FileReader("C:\\Users\\gener\\Coding\\Java\\CSV Parser\\src\\Main\\Resources\\sample1.csv" ));
            int[] data = new int[number_of_lines]; int i=0;
            bread2.readLine();  //for slipping the first row

            System.out.println("\n\nFew Enties in the CSV file : \nLoading...");
            TimeUnit.SECONDS.sleep(2);
            while ((row = bread2.readLine()) != null){
                values = row.split(",");
                System.out.println("ID : " + values[0] + "\tPeriod : " + values[1] + "\tData : " + values[2]);
                // if(i==0){
                //     i++; continue;
                // }
                
                data[i] = Integer.parseInt(values[2]);
                i++;
            }

            System.out.println("\n\nThe UnSorted Data values :\nLoading...");
            TimeUnit.SECONDS.sleep(2);
            // just checking 
            for (int j = 0; j < data.length; j++) {
                System.out.println(data[j]);
            }
            bread2.close();

            calc_5_number_summary(data,number_of_lines);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    public static void calc_5_number_summary(int[] data,int size) throws InterruptedException{
        int temp = 0;

        System.out.println("Sorting the data values...please wait");
        //soting the data
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < (size-i) ; j++){
                if (data[j-1]>data[j]){
                    temp = data[j-1];
                    data[j-1] = data[j];
                    data[j] = temp;
                }
            }
        }


        System.out.println("\n\nThe Sorted Data values :\nLoading...");
        TimeUnit.SECONDS.sleep(2);
        for (int j = 0; j < data.length; j++) {
            System.out.println(data[j]);
        }

        int minimum = data[0]; 
        int maximum = data[size-1]; 
        int median = data[(int)(size+1)/2];
        int quartile1 = data[(int) (size+1)/4];
        int quartile3 = data[(int) (3*(size+1))/4];


        System.out.println("\n\n5 Number Summary : ");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Minimum : " + minimum ); TimeUnit.MILLISECONDS.sleep(500);
        System.out.println("Maximum : " + maximum ); TimeUnit.MILLISECONDS.sleep(500);
        System.out.println("Median : " + median ); TimeUnit.MILLISECONDS.sleep(500);
        System.out.println("Quartile 1 : " + quartile1 ); TimeUnit.MILLISECONDS.sleep(500);
        System.out.println("Quartile 3 : " + quartile3 ); TimeUnit.MILLISECONDS.sleep(500);
        System.out.println("Thank You" );
    }
}
