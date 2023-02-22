public class tower_of_hanoi {
    public static void main(String[] args) {
        int n=3;
        Print(n,"A","B","C");
    }
    public static void Print(int n,String s,String h,String d){
        if(n==0){
            return;
        }
        Print(n-1,s,d,h);
        System.out.println("Move " +n+" th disk from " +s +" to " +d);
        Print(n-1, h, s, d);
        
    }
}
