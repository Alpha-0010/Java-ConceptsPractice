package training.programs;
import java.util.*;

public class QustionTen {
    public static void main(String[] args) {
        String inp="Loren ipsum dolar seit";
        System.out.println(reverseString(inp));
    }

    private static String reverseString(String inp){
        String out=new String();
        String[] arr=inp.split(" ");
        for(int i=arr.length-1;i>=0;i--){
            out+=arr[i];
            out+=" ";
        }
        return out;
    }

}
