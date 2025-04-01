import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The reversed numbers are:");
        for (int j=n-1;j>=0;j--){
            System.out.println(arr[j]);
        }
    }
}
