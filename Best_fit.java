
public class Best_fit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int process =40;
		int memmory[]= {100,10,180,200,50};
		int difference[] =new int[5];
		
		for(int i=0;i<memmory.length;i++)
		{
			difference[i]=-1;
		}
		
		for(int i=0;i< difference.length;i++)
		{
			difference[i]=memmory[i]-process;
		}
		
		int min=0;
		for(int i=0;i< difference.length;i++)
		{
			if(difference[i]>0 && difference[i]<difference[min])
				min=i;
		}
		
		System.out.println("Blocked allocated to process 40 is "+(min+1));
		System.out.println("Minimum wastage of memmory is "+ difference[min]);

	}

}
