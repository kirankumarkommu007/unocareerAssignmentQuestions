import java.util.Scanner;
public class ReverseArray {

	public static void main(String[] args) {
     Scanner input =new Scanner(System.in);
     System.out.println(" Enter the Size Of Array :");
    int k = input.nextInt();
    int array [] = new int[k];
    System.out.println(" Enter the elements in the array ");
    for(int i =array.length-1; i >= 0; i--) {
    	array[i] = input.nextInt();
    }
    for(int j =0;j<=array.length-1; j++) {
        System.out.println("the reversed Array is :" +array[j]);    }
	}
}
