import java.util.Scanner;

public class maxminArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];//can be int max = Integer.MAX_VALUE();

        for (int j=0;j<n;j++){
            if (arr[j] > max) {
                max = arr[j];
            }
            if (arr[j] < min) {
                min = arr[j];
            }

        }
        System.out.println("Max value:"+max);
        System.out.println("Minimum value:"+min);
    }
}
