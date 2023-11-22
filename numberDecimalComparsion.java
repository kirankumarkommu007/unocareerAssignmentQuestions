package newAssignments;

public class numberDecimalComparsion {
	
	static int getDecimal(double a,int b) {
		double y =0;
		  int ld =1;
		  int res =1;
		  int p =1;
		  int newres=0;
		  while(ld >= 0) {
			  p =(p*10);
			  y = a*p;     //12.456*10 = 124.56
			  res =(int)y; //124
			  ld =res%10;  //4
			  newres = (newres*10)+ld; 
			  String j =Integer.toString(newres);
			  if(j.length()==b) {
				  break;
			  }  
		  }
		return newres;
	}

	public static void main(String[] args) {
		double k =12.456187;
		double h =980.456122; 
		int length =3;
		 
		int newres = getDecimal(k,length);
		int newres2 = getDecimal(h,length);
		
        System.out.println(newres);
        System.out.println(newres2);
	   
        if(newres == newres2 ) {
		     System.out.println("Yes decimals are Equal");
	    }
	    else System.out.println("No decimals are not equal");
	  
	}

}
