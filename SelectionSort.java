import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of an array n: ");
        int n= sc.nextInt();
        int[] arr1 = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
             arr1[i]=sc.nextInt();
        }

        for(int i=0;i<n-1;i++){
            int smallest= i;
            for(int j= i+1;j<n;j++){
                if(arr1[smallest]>arr1[j]){
                    smallest= j;
                     }
                
            }
            int temp= arr1[smallest];
            arr1[smallest]=arr1[i];
            arr1[i]=temp;
        }
        for(int i=0;i<n;i++){
        System.out.print(arr1[i]+" ");
    
    }


    }
}
