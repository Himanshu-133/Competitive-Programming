import java.util.*;
public class Main{
    static final long mod=1000000007L;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long ans=0;
            long pow=1;
            while(b>0){
                if((b&1)==1){
                    ans=(ans+pow)%mod;
                }
                pow=(pow*a)%mod;
                b>>=1;
            }
            System.out.println(ans);
        }
    }
}