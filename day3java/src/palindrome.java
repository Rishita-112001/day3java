import java.util.*;

public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string:");
        String s1 = sc.nextLine();
        StringBuilder sb = new StringBuilder(s1);
        sb.reverse();
        if (sb.toString().equals(s1)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

    }
}
