package training.programs;
import java.util.*;

public class QuestionNine {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,10};
        int[] res=sumOfEvenOdd(nums);
        for(int elem : res){
            System.out.print(elem+" ");
        }
    }

    private static int[] sumOfEvenOdd(int[] nums){
        int oddSum=0;
        int evenSum=0;
        for(int elem : nums){
            if(elem%2==0){
                evenSum+=elem;
            }else{
                oddSum+=elem;
            }
        }
        return new int[]{evenSum,oddSum};
    }

}
