/*input two strings; print "even" if the difference between white spaces
* in the two strings is even (/ by 2) and "odd" if it's odd*/

import java.util.Scanner;
public class Wtspacdiff {
    public static String difference(String str, String str2){
        char[] ch= str.toCharArray();
        char[] ch2= str2.toCharArray();
        int c1=0, c2=0;
        int diff=0;
        for(int i=0;i<ch.length;i++){
            if(Character.isSpaceChar(ch[i])){
                c1++;
            }
        }
        for(int i=0;i<ch2.length;i++) {
            if (Character.isSpaceChar(ch2[i])) {
                c2++;
            }
            diff = Math.abs(c1 - c2);
        }
        if(diff%2==0){
            return"even";
        }
        else{
            return "odd";
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.print(difference(str,str2));
    }
}
