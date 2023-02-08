public class sliding_window {
    public static void main(String[] args) {
        int arr[] = {1,4,5,6,7,8,2,3,9,1,2,5};
        int k =3;
        System.out.println(max_sum(arr, k));
    }
    public static int max_sum(int arr[],int k){
        int max=0;
        int sum =0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        max =sum;
        for(int i=k;i<arr.length;i++){
            sum= sum+arr[i]; // inc hua element
            sum=sum-arr[i-k]; // dec hua element
            max = Math.max(sum,max);
        }
        return max;
    }
}
