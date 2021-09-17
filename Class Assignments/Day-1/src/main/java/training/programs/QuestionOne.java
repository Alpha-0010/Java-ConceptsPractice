package training.programs;

public class QuestionOne {
    public static void main(String[] args) {
        int day=29;
        int year=2018;
        int month=2;
        boolean res=isValidDate(year,month,day);
        System.out.println(res);
    }

    static int[] arr=new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
    private static boolean isValidDate(int year,int month,int day){
        if(month>12){
            return false;
        }
        if(year<1 || month<1 || day<1){
            return false;
        }
        if(month!=2 && day>arr[month]){
            return false;
        }
        if(year%4==0 && month==2 && day!=29){
            return false;
        }
        if(year%4!=0 && month==2 && day!=28){
            return false;
        }

        return true;
    }

}
