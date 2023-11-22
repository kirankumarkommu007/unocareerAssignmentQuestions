package newAssignments;

public class NumberDecimalAnagram {

	public static void main(String[] args) {
		double k =12.456;
		double h =980.456;
		String n = Double.toString(k);
        String m =Double.toString(h);
        String Temp ="";
        String Temp2 ="";
        for(int i =n.length()-1; i>=0;i--) {
        	char ch =n.charAt(i);
        	
        	if(ch !='.') {
        		Temp =ch+Temp;
            }
        	else  if(ch =='.') {
        		break;
        	}
          }
         for(int j =m.length()-1; j>=0;j--) {
             	char ch2 =m.charAt(j);
             	
             	if(ch2 !='.') {
             		Temp2 =ch2+Temp2;
                 }
             	else  if(ch2 =='.') {
             		break;
             	}
            }

	if(Temp.length()==Temp2.length() && Temp.equals(Temp2)) {
		System.out.println("Yes decimals are Equal");
	}
	else System.out.println("no decimals are Not Equal");
	}
}
