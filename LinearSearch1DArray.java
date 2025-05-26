import java.util.*;
public class LinearSearch1DArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        //input
        System.out.println(" Enter the"+ n + " number of elements into the array: ");
        for(int i = 0; i<n;i++){
            numbers[i]=sc.nextInt();
        }

        System.out.println(" Enter the element to be searched");
        int x = sc.nextInt();

        //searching for the element
        for(int i=0;i<n;i++){
            if(numbers[i]==x){
                System.out.println(x+" is found at the location: "+ i);
            }
        }
    }
}