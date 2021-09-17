package training.programs;

import training.util.KeyboardUtil;

public class PersonInfo {
    public static void main(String[] args) {
        System.out.println("Hello!!!");
        int age=21;
        int height=183;
        int weight=71;
        String name="Shashwat";
        boolean isMarried=false;
        String city= KeyboardUtil.getString("Enter the City:---");
        System.out.println(name+" "+age+" "+height+" "+weight+" "+isMarried+" "+city);
    }
}
