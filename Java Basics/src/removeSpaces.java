public class removeSpaces {
	
	public static String noSpace(final String x) {
	        return x.replaceAll(" ", "");
	    }
	
	 public static int squareSum(int[] n)
	  { 
		 int sum=0;
		 for (int i = 0; i < n.length; i++) {
			 sum+=Math.pow(n[i],2);	
		}
		 return sum;
		 
	  }
	 public static int countSheeps(Boolean[] arrayOfSheeps) {
		    int counter =0;
		    for(int i=0; i<arrayOfSheeps.length; i++){
		      if(arrayOfSheeps[i])
		        counter++;
		    }
		    return counter;
		}
	 
	 public static int Liters(double time)  {
		    return (int)Math.floor(time*0.5);
		  }

	public static void main(String[] args) {
		String s="sd as ad";
		System.out.println(noSpace(s));
		
		Boolean[] array1 = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true };
		System.out.println(countSheeps(array1));
		
		double liter=3.3;
		System.out.println(Liters(liter));
	}

}
