package training.programs;
import java.util.*;

public class QuestionFour {
    public static void main(String[] args) {
        int from=2;
        int to=30;
        sumPrime(from,to);
    }

    public static void sumPrime(int from,int to){
        boolean[] sieve=new boolean[to+1];
        Arrays.fill(sieve,true);
        sieve[0]=false;
        sieve[1]=false;
        for(int i=2;i*i<=to;i++){
            for(int j=i*i;j<=to;j+=i){
                if(sieve[i]==true){
                    sieve[j]=false;
                }
            }
        }
        int sum=0;
        for(int i=from;i<=to;i++){
            if(sieve[i]==true){
                sum+=i;
            }
        }
        System.out.println(sum);
    }

}
