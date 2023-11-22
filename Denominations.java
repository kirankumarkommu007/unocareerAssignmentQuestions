package newAssignments;
import java.util.Scanner;

public class Denominations {

	public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
    int []notes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
    int b =input.nextInt();
    for (int i =0;i<notes.length;i++) {
    	int res = b/notes[i];
    	b = b%notes[i];
        
    	if(notes[i]>=10) {
        	System.out.println(notes[i]+" Rupees Notes are :"+res);
    	}
    	
    	else if(notes[i]<10) {
        	System.out.println(notes[i]+"  Rupee Coins are  :"+res);
    	}
      }
    
   }

}
