public class product_having_less_than_k {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int n= nums.length;


        int[] ans=product(nums);
        for (int i = 0; i < n; i++) {
            System.out.println(ans[i]);
        }

    }
    public static int[] product(int nums[])
    {
        int n= nums.length;
        int[] A=new int[n];
        int[] B=new int[n];
        A[0]=1;
        B[n-1]=1;
        for (int i = 1; i <n ; i++) {
            A[i]=A[i-1]*nums[i-1];
        }
        for (int i = n-2; i >=0 ; i--) {
            B[i]=B[i+1]*nums[i+1];
        }
        for (int i = 0; i < n; i++) {
            A[i]=A[i] * B[i];
        }
        return A;
    }
}
