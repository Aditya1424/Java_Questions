public class coin_recur {
    public static void main(String[] args) {
        int n=3;
        
        System.out.println("\n"+Count(n, ""));
    }
    public static void Print(int n,String ans){
        if(n==0){
            System.out.print(ans+" ");
            return;
        }
        Print(n-1, ans+"H");
        Print(n-1, ans+"T");
    }
    public static int Count(int n,String ans){
        if(n==0){
            System.out.print(ans+" ");
            return 1;
        }
        int a=Count(n-1, ans+"H");
        int b=Count(n-1, ans+"T");
        return a+b;
    }
}
