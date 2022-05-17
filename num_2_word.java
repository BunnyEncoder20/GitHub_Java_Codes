    public class num_2_word {

        void convorter(char number[]){
            
            String ones_place[] = new String[] {"Zero","One","Two","Three","Four","Five", "Six", "Seven", "Eight", "Nine"};
            String teens[] = new String[] {"nope","ten" ,"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
            String tens_place[] = new String[] {"nope","nope_pt2", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
            String hundreds_place[] = new String[] {"Hundred", "Thousand"}; 

            if(number.length==1){
                System.out.print(String.valueOf(number) + " : " + ones_place[number[0]-'0']);
                //number[0]='0' gets the decimal number of element from the 1st index of array number
                //basically converting from ascii to decimal
                //that decimal number's word will be equal to it's index value in ones_places array
                //ez pez 
            }

            int count = 0, length = number.length;
            while(count<length)
            {
                if(length==3 || length==4)
                {
                    if(number[count]-'0' !=0){
                    System.out.print(ones_place[number[0]-'0']+" ");    
                    System.out.print(hundreds_place[length-3]+" "); 
                    }
                    //if length == 3 then hundreds_place[3-3 = 0] = "Hundred"   
                    //if length == 4 then hundreds_place[4-3 = 1] = "thousand"   
                    length--;
                }
                else if(length==2)
                {
                    if(number[count]-'0'==1)
                    {
                        //to get the index for the teens array we add the digits of tens and ones place
                        // eg: 11 = 1+1 = 2 and teens[2] = 11, 15 = 1+5 = 6 & teens[6] = 15 
                        int sum = number[count]-'0' + number[count+1]-'0';
                        System.out.print(teens[sum]+" ");
                        return;
                    }

                    else{
                        int tens = number[count]-'0';

                        if(tens>0){
                            System.out.print(tens_place[tens]+" ");
                        }
                        else{
                            System.out.print(" ");
                        }

                        count++; // go to next digit if this one zero

                        if (number[count]-'0' != 0) {       //if this false then number has only 1 non zero digit
                            System.out.print(ones_place[number[count]-'0']);
                        }


                    }
                }

                count++;
            }
        }
        public static void main(String[] args) {
            num_2_word obj = new num_2_word();
            System.out.print("\n\n");
            obj.convorter("1234".toCharArray());	//converts string directly into character array
            System.out.print("\n\n");
        }
    }