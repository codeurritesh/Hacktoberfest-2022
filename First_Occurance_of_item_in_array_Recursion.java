public class First_Occurance_of_item_in_array_Recursion {
        public static void main(String[] args) {
            int [] arr={1,2,3,4,5,6,7,3,8,9};
            int item=3;
            int i= 0;
            System.out.println("INDEX : "+find(arr,item,i));
        }
        public static int find(int arr[],int item,int index){
            if(index>arr.length-1){
                return -1;
            }
            if(arr[index]==item){
                return index;
            }

            return find(arr,item,++index);
        }
}
