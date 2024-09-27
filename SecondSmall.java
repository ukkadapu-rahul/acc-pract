import java.util.*;
public class SecondSmall {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[]={11,0,32,32,6,4,7576,23,5,90};
        int smallest = Integer.MAX_VALUE;
        int ssmallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                ssmallest = smallest;
                smallest= arr[i];
            }
            else if(ssmallest>arr[i]){
                ssmallest=arr[i];
            }
        }
System.out.print(ssmallest);



    }
}
