
public class countPositivesSumNegatives {
	
	public static int[] countPositivesSumNegatives(int[] input)
    {
      if (input == null || input.length == 0)
        return new int[0];   
      int[] res=new int[2];
		  for (int i = 0; i < input.length; i++) {
			if(input[i]<0)
				res[1]+=input[i];
			else if(input[i]>0)
				res[0]+=1;
		  }
		return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}