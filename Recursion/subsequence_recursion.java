public class subsequence_recur {
    public static void main(String[] args) {
        String ques = "abc";
        String ans="";
        PrintSub(ques,ans);
        System.out.println("\n"+count);

    }
    static int count=0;
    public static void PrintSub(String ques,String ans){
        
        if(ques.length()==0){
            System.out.print(ans+" ");
            count++;
            return;
            
        }

        char ch  = ques.charAt(0);
        PrintSub(ques.substring(1),ans);
        PrintSub(ques.substring(1),ans+ch);
    }
}
