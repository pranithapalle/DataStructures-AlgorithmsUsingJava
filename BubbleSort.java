import java.util.*;
public class BubbleSort {

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
            for(int j=0;j<n-i-1;j++){
                if(arr1[j]>arr1[j+1]){
                    int temp = arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;
                     }
                
            }
        }
        for(int i=0;i<n;i++){
        System.out.print(arr1[i]+" ");
    
    }


    }
    
}
