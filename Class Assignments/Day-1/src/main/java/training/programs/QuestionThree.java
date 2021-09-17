package training.programs;

import java.util.ArrayList;
import java.util.List;

public class QuestionThree {
    public static void main(String[] args) {
        int a=2;
        int b=10;
        int c=4;
        ascendingSort(a,b,c);
    }

    private static void ascendingSort(int a,int b,int c){
        int[] arr=new int[3];
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        int n=arr.length;
        mergeSort(arr,0,n);
        for(int elem : arr){
            System.out.print(elem+" ");
        }
    }

    private static void mergeSort(int[] arr,int left,int right){
        if(right-left<=1){
            return;
        }
        int mid=left+(right-left)/2;
        mergeSort(arr,left,mid);
        mergeSort(arr,mid,right);
        merge(arr,left,right,mid);
    }

    private static void merge(int[] arr,int left,int right,int mid){
        List<Integer> tempList=new ArrayList<>();
        int i=left,j=mid;
        while(i<mid && j<right){
            if(arr[i]<=arr[j]){
                tempList.add(arr[i]);
                i++;
            }else{
                tempList.add(arr[j]);
                j++;
            }
        }
        while(i<mid){
            tempList.add(arr[i]);
            i++;
        }
        while(j<right){
            tempList.add(arr[j]);
            j++;
        }
        for(int k=left;k<right;k++){
            arr[k]=tempList.get(k-left);
        }
    }
}
