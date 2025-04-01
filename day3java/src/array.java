import java.util.Scanner;

public class array {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int[] a = {1,2,3,4,5,6,7,8,9,10 };//initializing array
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        //arr[1] = 10;another way of initializing the value
        for (int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        for (int j=0;j<n;j++){
            System.out.println(arr[j]);
        }
        for (int var : arr){
            System.out.println(var);
        }
    }
}
