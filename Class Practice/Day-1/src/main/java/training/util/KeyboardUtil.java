package training.util;
import java.util.Scanner;

public class KeyboardUtil {
    public static String getString(String message){
        System.out.println(message);
        Scanner sc=new Scanner(System.in);
        return sc.nextLine();
    }
    public int getInteger(String message){
        System.out.println(message);
        Scanner sc=new Scanner(System.in);
        return sc.nextInt();
    }
    public double getDouble(String message){
        System.out.println(message);
        Scanner sc=new Scanner(System.in);
        return sc.nextDouble();
    }
}
