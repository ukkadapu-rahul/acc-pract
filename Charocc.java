import java.util.*;
public class Charocc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch=sc.next().charAt(0);
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                count+=1;
            }
        }
        System.out.print(count);

    }
}
// count character occurences in a string