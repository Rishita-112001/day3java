import java.util.Scanner;

public class arraySquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The squared values of the numbers are:");
        for (int j=0;j<n;j++){
            System.out.println(arr[j]*arr[j]);
        }
    }
}
