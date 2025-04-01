import java.util.*;

public class reverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string here:");
        String s1 = sc.nextLine();
        int len = s1.length();
        String str = "";
        for(int i=len-1;i>=0;i--){
            str += s1.charAt(i);
        }
        System.out.println(str);

    }
}
