import java.util.Scanner;
public class Numofoccurence {

	public static void main(String[] args) {
     Scanner input =new Scanner(System.in);
     System.out.println(" Enter the Desired element");
     int o = input.nextInt();
     int count =0;
     System.out.println(" Enter the Size Of Array :");
    int k = input.nextInt();
    
    int array [] = new int[k];
    System.out.println(" Enter the elements in the array ");
     for(int i =0;i<=array.length-1; i++) {
    	array[i]=input.nextInt();  
             if(array[i]==o) {
            	 count++;
             }
            
    }
    System.out.println(" the number of occurences is : "+ count);
	}
}
