package training.programs;

import java.util.Arrays;

public class QuestionTwo {
    public static void main(String[] args) {
        int num=17;
        boolean res=isPrime(num);
        System.out.println(res);
    }

    private static boolean isPrime(int num){
        boolean[] sieve=new boolean[num+1];
        Arrays.fill(sieve,true);
        sieve[0]=false;
        sieve[1]=false;

        for(int i=2;i*i<=num;i++){
            for(int j=i*i;j<=num;j+=i){
                if(sieve[i]){
                    sieve[j]=false;
                }
            }
        }

        return sieve[num];
    }

}
