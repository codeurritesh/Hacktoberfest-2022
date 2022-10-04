public class First_Occurance_of_item_in_array_Recursion {
             
       public static void main(String[] args) {
                        
            int[] arr = {1,4,5,8,2,11,3,4,7,9};
            int target_element = 10;    //Element to find
            int start_index = 0;        //recursion starting with index 0
            int index = find_first_occurence(arr,target_element,start_index);  //returns the index if found else -1
            if(index == -1){
                System.out.println("ELEMENT NOT FOUND");      
            }
            else{
                System.out.println("ELEMENT FOUND AT INDEX " + index);
            }            
        }
        
        public static int find_first_occurence(int arr[],int target_element,int index){    //recursive function to find index
            if(index > arr.length-1){                    //index exceeds array size
                return -1;
            }
            if(arr[index]==target_element){             //index with element match
                return index;
            }
            return find_first_occurence(arr,target_element,++index);     //recursive call
        }
}
