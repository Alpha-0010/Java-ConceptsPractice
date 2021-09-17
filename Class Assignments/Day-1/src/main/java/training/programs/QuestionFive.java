package training.programs;
import java.util.*;

public class QuestionFive {
    public static void main(String[] args) {
        int res=fib(5);
        System.out.println(res);
    }

    // 0 1 1 2 3 5 ....
    private static int fib(int n){
        int[] arr=new int[n];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n-1];
    }

}
