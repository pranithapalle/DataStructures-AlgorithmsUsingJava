import java.util.Scanner;

public class LinearSearch2DArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int rows = sc.nextInt();
        int cols= sc.nextInt();
        int[][] numbers = new int[rows][cols];

        //input
        System.out.println(" Enter the"+ rows + cols+ " number of elements into the array: ");
        for(int i = 0; i<rows;i++){
            for(int j=0; j<cols; j++){
            numbers[i][j]=sc.nextInt();
            }
        }

        System.out.println(" Enter the element to be searched");
        int x = sc.nextInt();

        //searching for the element
        for(int i=0;i<rows;i++){
            for(int j =0 ; j< cols;j++){
            if(numbers[i][j]==x){
                System.out.println(x+" is found at the location: "+ i +", "+ j);
            }
        }
        }
    }
}
