import java.util.*;
public class EvenOdd {
    public static String printAns(int[] arr){
        int len= arr.length;
        String ans="";
        for(int i=0;i<len;i++){
            if(arr[i]%2==0){
                ans= ans +"even ";
            }
            else{
                ans= ans+" odd ";
            }
        }

        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("enter array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(printAns(arr));
    }
}
// in an array print if the number is even or odd